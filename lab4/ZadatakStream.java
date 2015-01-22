package com.bitCamp.lab4;

import java.io.*;

public class ZadatakStream {

	public static void main(String[] args) {

		InputStream is = new DataInputStream(System.in);
		OutputStream os = new DataOutputStream(System.out);

		byte[] buffer = new byte[10];
		try {
			while (is.read(buffer) >= 0) {
				os.write(buffer);
				
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