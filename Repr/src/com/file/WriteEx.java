package com.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("./test.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			                                                       
			try {
				os.write(a);
				os.write(b);
				os.write(c);
				
				os.flush();
				os.close();
				
				byte[] array = {40,50,60};
			} catch (IOException e) {
				e.printStackTrace();
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
