$(function() {
	var CompanyName = '';
	var id = getQueryString('id');
	// 使用时注释测试的数据地址，放开这里2行
	$.getJSON(basePath + '/web/homeIndexGuiJiTui?code=' + code,
			function(data) {
				CompanyName = data.name;
				//console.info(data);

				/*
				 * $.getJSON(basePath+'/script/libraries/highcharts/aapl.json',
				 * function(data) { CompanyName=data.name; });
				 * $.getJSON(basePath+'/script/libraries/highcharts/goog.json',
				 * function(data) {
				 */
				// Create the chart
				// alert(data.data);
				var data = data.data;
				var ohlc = [], volume = [], dataLength = data.length;
				for (var i = 0; i < dataLength; i++) {
					ohlc.push([ data[i][0], data[i][1], ]);//金额
					volume.push([ data[i][0], data[i][2] ])//量
				}
				//console.log(ohlc);
				//console.log(volume);

				var groupingUnits = [ [ 'week', [ 1 ] ],
						[ 'month', [ 1, 2, 3, 4, 6 ] ] ];
				Highcharts.setOptions({
					lang : {
						resetZoomTitle : '区间：'
					}
				});
				$('#container').highcharts(
						'StockChart',
						{
							credits : {
								href : 'javascript:;',
								text : 'new3band.com'
							},
				            navigator : {
				                yAxis: {
				                    title: {
				                        rotation : 0,
				                        text: '股价',
				                        margin:10,
				                        dateTimeLabelFormats:'%Y/%m'
				                    }
				                }
				            },
							rangeSelector : {
								selected : 5,
				                inputDateFormat:'%Y/%m/%d',
								inputEnabled : $('#container').width() > 750,
								buttons : [ {
									type : 'month',
									count : 1,
									text : '1m'
								}, {
									type : 'month',
									count : 3,
									text : '3m'
								}, {
									type : 'month',
									count : 6,
									text : '6m'
								}, {
									type : 'ytd',
									text : 'YTD'
								}, {
									type : 'year',
									count : 1,
									text : '1y'
								}, {
									type : 'all',
									text : 'All'
								} ],
								buttonTheme : { // styles for the buttons
									fill : 'none',
									stroke : 'none',
									'stroke-width' : 1,
									r : 8,
									style : {
										color : '#039',
										fontWeight : 'bold'
									},
									states : {
										hover : {},
										select : {
											fill : '#039',
											style : {
												color : 'white'
											}
										}
									}
								},
							},

							title : {
								text : CompanyName
							},
							yAxis : [ {
								title : {
									text : '股价(元)',
									rotation : 0,
									margin : 25
								},
								min : 0,
								opposite : false
							}, {
								labels : {
									formatter : function() {
										return this.value / 10000;
									}
								},
								title : {
									text : '成交量(万)',
									rotation : 0,
									margin : 30
								}
							} ],
							xAxis : [ {
								labels : {
									formatter : function() {
										return Highcharts.dateFormat(
												'%Y/%m/%d', this.value);
									}
								}
							} ],
							series : [ {
								name : '收盘价',
								data : ohlc,
								tooltip : {
									valueDecimals : 2
								}
								,dataGrouping:{
									units:groupingUnits
								}
							}, {
								type : 'column',
								name : '交易量',
								color : '#2f7ed8',
								data : volume,
								yAxis : 1,
								dataGrouping : {
									units : groupingUnits
								}
							} ]
						});
			});
});

function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}
