package com.bitCamp.lab4;

import java.io.*;
import java.util.LinkedList;

public class BITBuffer {

	public InputStream is;;

	public BITBuffer(InputStream is) {
		this.is = is;
	}

	public byte[] nextLine(InputStream is) {

		byte[] buffer = new byte[10];
		LinkedList<Byte> bufferedInput = new LinkedList<Byte>();

		try {
			while (is.read(buffer) >= 0) {

				for (int i = 0; i < buffer.length; i++) {

					if (buffer[i] == (byte) '\n') {

						byte[] tempBuffer = new byte[bufferedInput.size()];
						for (int j = 0; j < tempBuffer.length; j++) {
							tempBuffer[j] = bufferedInput.get(j);
							
						}
						return tempBuffer;
					} else
						bufferedInput.add(buffer[i]);
				}
				buffer = new byte[buffer.length];
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
