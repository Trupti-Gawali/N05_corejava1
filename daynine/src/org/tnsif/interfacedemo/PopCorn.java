package org.tnsif.interfacedemo;

/*below annotation ensures that we have to use exactly one abstract 
 * method inside an interface*/
@FunctionalInterface
public interface PopCorn {
	//abstract method
	void displayReceipe();
    //void display();
}
