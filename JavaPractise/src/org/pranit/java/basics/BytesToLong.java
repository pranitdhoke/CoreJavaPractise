package org.pranit.java.basics;

import java.nio.ByteBuffer;

public class BytesToLong {
	public static void main(String[] args) {
		int i =23423;
		byte[] bytes  = ByteUtils.longToBytes(i);
		System.out.println(bytes);
		
		System.out.println(ByteUtils.bytesToLong(bytes));
		

	}
}

class ByteUtils {
    private static ByteBuffer buffer = ByteBuffer.allocate(Long.SIZE);    

    public static byte[] longToBytes(long x) {
        buffer.putLong(0, x);
        return buffer.array();
    }

    public static long bytesToLong(byte[] bytes) {
        buffer.put(bytes, 0, bytes.length);
        buffer.flip();//need flip 
        return buffer.getLong();
    }
}	