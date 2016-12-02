package com.hwaggLee.qdyx.tsmarket;

import java.nio.charset.Charset;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

public class HCoderFactory implements ProtocolCodecFactory {

	private final HDecoder decoder;
	private final HEncoder encoder;
//	private final TextLineEncoder encoder;

	public HCoderFactory() {
		this(Charset.defaultCharset());
	}

	public HCoderFactory(Charset charset) {
		decoder = new HDecoder();
		encoder = new HEncoder();
//		encoder = new TextLineEncoder();
	}

	public ProtocolEncoder getEncoder(IoSession session) throws Exception {
		return encoder;
	}

	public ProtocolDecoder getDecoder(IoSession session) throws Exception {
		return decoder;
	}
}
