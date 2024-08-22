package com.java.stringOperations;

public class RepeatedStringFromWord {

	public static void main(String[] args) {
		
		String sentence="Naresh is from hyderabad Naresh is from hyderabad Naresh is from hyderabad";
		String[] specificWord =sentence.split(" ");
		
		System.out.println(specificWord.length);
		String exp = null;
		int count=0;
		
		for(String spec:specificWord) {
			if(spec.equals("Naresh")) {
				count++;
				exp=spec;
			}
		}
		
		System.out.println("number of times "+exp +"is "+count +"  in the given expression");
	}
}


