//program to demonstrate on Access specifier
package org.tnsif.accessspecifier;
public class Bank {
	
	//different access specifier
	  public String Bankname;
	  private int pinNo;
	  long accountNo=123456789123L;
	  
      public void displayPublic()
      {
    	  System.out.println("Bank Name is: "+Bankname);
      }
      
      private void displayPrivate()
      {
    	  System.out.println("Pin No. is: "+pinNo);
      }
      
      void displayDefault()
      {
    	  System.out.println("Account No. is: "+accountNo);
      }
}
