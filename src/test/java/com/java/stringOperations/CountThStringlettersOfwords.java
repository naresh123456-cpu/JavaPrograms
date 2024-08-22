package com.java.stringOperations;

public class CountThStringlettersOfwords {

	public static void main(String[] args) {
		String s="Welcome to java";
		
		int count=0;
		System.out.println(s.length());
	
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)!=' ') {
				count++;
				
			}
		}
		
		System.out.println(count);

	}

}
