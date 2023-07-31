//It can be used to refer instance

package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
	//default variable
	int x,y;
	
	void setdata(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		ThisKeywordDemoOne t=new ThisKeywordDemoOne();
		t.setdata(2, 3);
		t.display();

	}

}
