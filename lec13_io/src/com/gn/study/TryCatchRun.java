package com.gn.study;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatchRun {
	public static void main(String[] args) {
		File dir = new File("C:\\test\\sub");
		if(!dir.exists()) {
		  dir.mkdirs();
		}
		File file = new File(dir,"sample4.txt");
		try(BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
			  out.write("Hello2");
			  out.newLine();
			  out.write("Bye2");
			  out.newLine();
			} catch (IOException e) {
			  e.printStackTrace();
			}
		
	}
}
