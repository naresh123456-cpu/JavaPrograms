package com.java.prractices;

public class TestSplitMethod {

	public static void main(String[] args) {
		String s="Python,java,Test";
		String s1[]=s.split(",");
		for(String sp:s1) {
			System.out.println(sp);
		}

	}

}
