<#include "/base/include.ftl">
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body style="overflow-x:auto;">
		<div style="margin-left:120px;">
		<div class="chartcontent">
			<div class="pagedown">
				<div class="pageleft">
						<div class="chart" id="main3" style="width:600px;height:200px;">
						</div>
				</div>
			</div>
		</div>	
	</body>
</html>	
<script src='${basePath}/scripts/baidu/echarts/echarts-all.js'></script>
<script type="text/javascript">    
// 基于准备好的dom，初始化echarts图表
var axisData = [
    "2013/1/24", "2013/1/25", "2013/1/28", "2013/1/29", "2013/1/30",
    "2013/1/31", "2013/2/1", "2013/2/4", "2013/2/5", "2013/2/6", 
    "2013/2/7", "2013/2/8", "2013/2/18", "2013/2/19", "2013/2/20", 
    "2013/2/21", "2013/2/22", "2013/2/25", "2013/2/26", "2013/2/27", 
    "2013/2/28", "2013/3/1", "2013/3/4", "2013/3/5", "2013/3/6", 
    "2013/3/7", "2013/3/8", "2013/3/11", "2013/3/12", "2013/3/13", 
    "2013/3/14", "2013/3/15", "2013/3/18", "2013/3/19", "2013/3/20", 
    "2013/3/21", "2013/3/22", "2013/3/25", "2013/3/26", "2013/3/27", 
    "2013/3/28", "2013/3/29", "2013/4/1", "2013/4/2", "2013/4/3", 
    "2013/4/8", "2013/4/9", "2013/4/10", "2013/4/11", "2013/4/12", 
    "2013/4/15", "2013/4/16", "2013/4/17", "2013/4/18", "2013/4/19", 
    "2013/4/22", "2013/4/23", "2013/4/24", "2013/4/25", "2013/4/26", 
    "2013/5/2", "2013/5/3", "2013/5/6", "2013/5/7", "2013/5/8", 
    "2013/5/9", "2013/5/10", "2013/5/13", "2013/5/14", "2013/5/15", 
    "2013/5/16", "2013/5/17", "2013/5/20", "2013/5/21", "2013/5/22", 
    "2013/5/23", "2013/5/24", "2013/5/27", "2013/5/28", "2013/5/29", 
    "2013/5/30", "2013/5/31", "2013/6/3", "2013/6/4", "2013/6/5", 
    "2013/6/6", "2013/6/7", "2013/6/13"
];

var series_option3 = [
                560434, 226738, 696370, 249697, 248563, 
                620504, 555496, 525337, 270968, 458354, 
                933507, 896523, 365702, 633095, 722230, 
                662783, 875798, 776423, 105979, 882629, 
                598278, 231253, 430465, 672208, 253648, 
                608589, 884386, 739994, 263709, 776889, 
                692859, 105780, 848675, 755207, 397426, 
                -478607, 859532, 854862, 983288, 857084, 
                -759358, 733589, 669975, 775965, 688035, 
                -736666, 733504, 709025, 623270, 569688, 
                -586275, 669558, 599865, 688825, 953830,
                -822450, 822755, 789772, 844832, 652558, 
                -598776, 783570, 862560, 794092, 839084, 
                -965298, 828048, 799480, 756647, 665826, 
                102257, 248870, 288435, 302528, 529046, 
                105205, 920253, 999206, 203525, 435588, 
                103546, 703990, 964868, 923778, 742688,
                752658, 805835, 797452
            ];


option3 = {
    tooltip : {
        trigger: 'axis',
        showDelay: 0             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
    },
    legend: {
        y : -30,
        data:['上证指数','成交金额(万)','虚拟数据']
    },
    toolbox: {
        y : -30,
        show : true,
        feature : {
            mark : {show: true},
            dataZoom : {show: true},
            dataView : {show: true, readOnly: false},
            magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    dataZoom : {
        y:200,
        show : true,
        realtime: true,
        start : 50,
        end : 100
    },
    grid: {
        x: 80,
        y:5,
        x2:20,
        y2:30
    },
    xAxis : [
        {
            type : 'category',
            position:'bottom',
            boundaryGap : true,
            axisTick: {onGap:false},
            splitLine: {show:false},
            show: false,
            data : axisData
        }
    ],
    yAxis : [
        {
            type : 'value',
            scale:true,
            splitNumber:3,
            boundaryGap: [0.05, 0.05],
            axisLabel: {
                formatter: function (v) {
                    return Math.round(v/10000) + ' 万'
                }
            },
            show: false,
            splitArea : {show : true}
        }
    ],
    series : [
        {
            name:'虚拟数据',
            type:'bar',
            symbol: 'none',
            itemStyle: {
                normal: {
                    color: function(params) {
                        // build a color map as your need.
                        //red,green
                        console.log(params);
                        if(params.data<0) return "green";
                        if(params.data>0) return "red";
                        return "#000";
                    }
                }
            },
            data:series_option3,
            markLine : {
                symbol : 'none',
                itemStyle : {
                    normal : {
                        color:'red',
                        label : {
                            show:false
                        }
                    }
                },
                data : [
                    {type : 'average', name: '平均值'}
                ]
            }
        }
    ]
};


myChart3 = echarts.init(document.getElementById('main3'));
myChart3.setOption(option3);
/*
setTimeout(function (){
    window.onresize = function () {
        myChart.resize();
        myChart2.resize();
        myChart3.resize();
    }
},200)
*/

</script>