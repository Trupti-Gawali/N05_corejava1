package org.tnsif.interfacedemo;
//driver class
//program to demonstrate on interface
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't instantiate an interface
		//DebitCard d=new DebitCard();
        SBIDebitCard s=new SBIDebitCard();
        s.displayCardDetails();
        s.display();
        //print is a static method inside an interface to call print()method we have to use interfacename,methodname();
        DebitCard.print();
        CheesePopcorn c= new CheesePopcorn();
        c.displayReceipe();
        
        Person p=new Person();
        p.showDrinkName();
	}

}
