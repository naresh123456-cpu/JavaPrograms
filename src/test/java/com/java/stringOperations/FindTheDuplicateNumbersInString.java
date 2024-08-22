package com.java.stringOperations;

public class FindTheDuplicateNumbersInString {

	public static void main(String[] args) {
		String string1="abcdeabcdef";
		char ch[]= string1.toCharArray();
		
		for( int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					System.out.print(ch[i]+" ");
					break;
					
				}
			}
		}

	}

}
