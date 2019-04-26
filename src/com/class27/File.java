package com.class27;

//Create a class File that have following behaviors:open, edit, close.
//Edit and close are implemented methods while open is abstract.
//Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behavior.
//Example: to open .java file we need notepad++ or sublime tax,
//to open .doc file we need Microsoft word to be installed.

public abstract class File {

	public void edit() {
		System.out.println("We can open a file");
	}
    public void close() {
		System.out.println("We can close a file");
	}
    public abstract void open();
}
class JavaFile extends File{
  @Override
	public void open() {
		System.out.println("To open .java file we need notepead++ or sublime tex");
	}
}
class WordFile extends File{
    @Override
	public void open() {
		System.out.println("To open .doc file we need Microsoft word to be installed.");
	}
}
class PDFFile extends File{
    @Override
	public void open() {
		System.out.println("To open pdf file we need Adobe Reader software OS 8/9");
		
	}
	
}