package com.java.stringOperations;

public class RegularExpression {

	public static void main(String[] args) {
		String s="!@#$%nar^&123*" ;
		for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Check if the character is a special character
            if (!Character.isLetterOrDigit(ch)) {
                System.out.print(ch);
            }
        }

	}

}
