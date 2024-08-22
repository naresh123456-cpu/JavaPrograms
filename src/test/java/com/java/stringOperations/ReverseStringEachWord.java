package com.java.stringOperations;

public class ReverseStringEachWord {

	public static void main(String[] args) {
		
		String str="Welcome to Java and selenium";
		
		String reverseString="";
		
		String[] words=str.split(" ");
		
		for(String letter:words) {
			
			String reverseword="";
			
			for(int i=letter.length()-1;i>=0;i--) {
				
				reverseword=reverseword+letter.charAt(i);	
			}
			reverseString=reverseString+reverseword+" ";
			}
		
          System.out.println(reverseString);
	}
}


