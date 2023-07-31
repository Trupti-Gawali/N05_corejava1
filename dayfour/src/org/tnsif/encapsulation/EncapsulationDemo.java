package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAccNo(123456789123L);
		h.setAccType("current account");
		h.setCvvNo(233);
		h.setPinNo(1221);
		System.out.println(h.getAccNo());
		System.out.println(h.getAccType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());
		
		
	

	}

}
