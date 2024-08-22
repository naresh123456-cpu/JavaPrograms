package com.java.stringOperations;

public class TotalOccuranceOfCharectersInString {

	public static void main(String[] args) {

		String str="java is programming java oops";
		String words[]=str.split(" ");
		int count=0;
		for(String word:words) {
			if(word.equals("java")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
