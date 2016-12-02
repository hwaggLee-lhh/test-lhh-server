package com.hwaggLee.qdyx.tsmarket;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public class HDecoder extends CumulativeProtocolDecoder {

	@Override
	protected boolean doDecode(IoSession session, IoBuffer in, ProtocolDecoderOutput out) throws Exception {
		// Remember the initial position.
		int start = in.position();
//		byte previous = 0;
		byte[] requestMsgArray;
		while (in.hasRemaining()) {
			byte current = in.get();
			if (current == '\n') {
				// Remember the current position and limit.
				int position = in.position();
				int limit = in.limit();
				try {
					int dataLength = position - start - 1;//忽略掉\n,所以减1
					in.position(start);
					in.limit(position);
					requestMsgArray = new byte[dataLength];
					// The bytes between in.position() and in.limit()
					// now contain a full CRLF terminated line.
					in.get(requestMsgArray);
					out.write(new String(requestMsgArray));
				} finally {
					// Set the position to point right after the
					// detected line and set the limit to the old
					// one.
					in.position(position);
					in.limit(limit);
				}
				// Decoded one line; CumulativeProtocolDecoder will
				// call me again until I return false. So just
				// return true until there are no more lines in the
				// buffer.
//				previous = current;
				return true;
			}
		}
		in.position(start);
	
		return false;
		
	}
}
