package com.bitCamp.lab4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {
	
	public static void main(String[] args) {
		InputStream is = new BufferedInputStream(System.in);
		OutputStream os = new BufferedOutputStream(System.out);
		String str = "";
		BITBuffer novi = new BITBuffer(is);
		System.out.println(new String(novi.nextLine(is)));
	
		while(str != null){
			System.out.println(new String(novi.nextLine(is)));
		}

	}

	
}
