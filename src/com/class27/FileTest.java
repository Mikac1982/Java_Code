package com.class27;

public class FileTest {

	public static void main(String[] args) {
		System.out.println("-----object of a JavFile class-----");
		File file1=new JavaFile();
		file1.edit();
		file1.close();
		file1.open();
		
		System.out.println("-----object of a WordFile class-----");
		File file2=new WordFile();
		file2.edit();
		file2.close();
		file2.open();
		
		System.out.println("-----object of a PDFFile class-----");
		File file3=new PDFFile();
		file3.edit();
		file3.close();
		file3.open();
		
		
	}
}
