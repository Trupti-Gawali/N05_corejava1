package org.tnsif.interfacedemo;

public interface DebitCard {
//by default all the variables inside an interface is public static final
	//and if it final then we must have to initialize value for that variable
	long cardno=12345678910L;
	//we can't use concrete method inside interface
	//by default method inside an interface is abstract
	void displayCardDetails();
	//default method and static method is the new features of java 8 which can we use inside an interface
	default void display()
	{
		System.out.println("Default method");
	}
	//static method
	static void print()
	{
		System.out.println("Static method");
	}
	
}
