package org.tnsifabstractkeyword;
//driver class
//program to demonstrate on abstract keyword
public class AbstractClassExecutor {

	public static void main(String[] args) {
		//we can't create object for abstract class
		//Operator o=new Operator();
		Addition a=new Addition();
		a.print(10, 20);
		a.operation();
		

	}

}
