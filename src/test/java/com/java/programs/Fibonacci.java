package com.java.programs;

public class Fibonacci {// sum of two previous numbers

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8...
		
		int a=0,b=1,c,temp=5;
		
		for(int i=1;i<=temp;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
