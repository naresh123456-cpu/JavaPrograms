package com.java.programs;

public class SwappingWithoutUsingThirdVariable {
	
	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("before swapping the numbers a="+a+" and b="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping the numbers a="+a+" and b="+b);
	

}
}
