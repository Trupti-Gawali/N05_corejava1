//program to demonstrate on encapsulation
package org.tnsif.encapsulation;
public class HDFC {

	//private data members
	private long accNo;
	private int cvvNo;
	private String accType;
	private int pinNo;
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accNo=" + accNo + ", cvvNo=" + cvvNo + ", accType=" + accType + ", pinNo=" + pinNo + "]";
	}
	
	
}
