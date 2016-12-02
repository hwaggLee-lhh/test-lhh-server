package com.hwaggLee.qdyx.tsmarket;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

public class HEncoder extends ProtocolEncoderAdapter {
	
	public void encode(IoSession session, Object message, ProtocolEncoderOutput out) throws Exception {
		String msg = (String) message;
		byte[] msgArray = msg.getBytes();
		IoBuffer buffer = IoBuffer.allocate(msgArray.length , false);
		buffer.put(msgArray);
		buffer.flip();
		out.write(buffer);
		out.flush();
	}
}
