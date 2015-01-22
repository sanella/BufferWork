package com.bitCamp.lab4;

import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.LinkedList;

public class ZadataStream2 {
	public static void main(String[] args) {

		InputStream is = new BufferedInputStream(System.in);
		OutputStream os = new BufferedOutputStream(System.out);

		byte[] buffer = new byte[10];
		LinkedList<Byte> bufferedInput = new LinkedList<Byte>();

		try {
			while (is.read(buffer) >= 0) {
			
				os.write(buffer);
				
				
				for (int i = 0; i < buffer.length; i++) {

					if (buffer[i] == (byte) '\n') {
						os.write("Buffered: \n".getBytes());
						byte[] tempBuffer = new byte[bufferedInput.size()];
						for (int j = 0; j < tempBuffer.length; j++) {
							tempBuffer[j] = bufferedInput.get(j);

							
						}
							os.write(tempBuffer);
							os.flush();
					} else 
						bufferedInput.add(buffer[i]);
				}
				buffer = new byte[buffer.length];


			}

			System.out.println("Gotovo");
			is.close();
			os.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
