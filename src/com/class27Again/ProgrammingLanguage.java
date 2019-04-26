package com.class27Again;

public abstract class ProgrammingLanguage {

	public void understanLogic() {
		System.out.println("To learn programming you must understand logic");
	}
	public void knowSyntax() {
	    System.out.println("To learn programming you must understand logic");
	}
	
	public abstract void writeCode(); //abstract method-we do not know implementation(logic), it's hidden from you here
    public abstract void debug();
}
class Java extends ProgrammingLanguage{

	@Override
	public void writeCode() {
		System.out.println("To do Java programming you must use Eclopse, Netbeans or IntelliJ");
	}

	@Override
	public void debug() {
		System.out.println("In Java to debug we use Eclipse, Neatbeans or IntelliJ");
	}
}
class CSharp extends ProgrammingLanguage{

	@Override
	public void writeCode() {
		System.out.println("To do C# programming you must use Visual Studio");
	}

	@Override
	public void debug() {
		System.out.println("To do debug in C# you need to use Visual Studio");
   }
	
	
	
}