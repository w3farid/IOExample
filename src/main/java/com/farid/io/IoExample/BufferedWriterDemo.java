package com.farid.io.IoExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	//file path
	private static final String FILENAME = "/home/farid/Desktop/bw.txt";

	public static void main(String[] args) {
		//BufferedWriter api
		//https://docs.oracle.com/javase/7/docs/api/java/io/BufferedWriter.html
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
			String str = "This is the content to write into file";
			//write method
			bw.write(str);
			//break new line
			bw.newLine();
			String seconStr = "This is the content to write into file.";
			//write method
			bw.write(seconStr);
			//break new line
			bw.newLine();
			//console print message
			System.out.println("Successfully compeleted");
			//BufferedWritter close
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
