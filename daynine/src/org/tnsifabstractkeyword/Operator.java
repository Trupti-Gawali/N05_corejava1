package org.tnsifabstractkeyword;
public abstract class Operator {
    //abstract
	abstract void operation();
	abstract void multiplication();
	//concrete method
	void print(int a,int b)
	{
		System.out.println(a+b);
	}
}
