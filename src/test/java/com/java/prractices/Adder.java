package com.java.prractices;
//Method overloading types
// 

class TestOverLoading{
	public static void main(String args []) {
		System.out.println(Adder.add(2,3)); 
		
	}
}

public class Adder {
static int add(int a, int b) {
	return a+b;
}
static int add(int a , int b,int c) {
	return a+b+c;
}

}


