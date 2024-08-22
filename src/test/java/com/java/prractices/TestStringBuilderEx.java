package com.java.prractices;

public class TestStringBuilderEx {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Naresh");
		StringBuilder s1=new StringBuilder("Naresh1");
		StringBuilder s2=s.append(s1);
		System.out.println(s2);

	}

}
