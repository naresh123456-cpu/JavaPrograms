package com.java.stringOperations;

public class SpliUsage {
	
	    public static void main(String[] args) {
	        String str = "Hyderabad sravani meduri  test Naresh ";
	        String[] parts = str.split(" ",0 ); // Split based on space, limit to 2 parts
	        
	        for (String part : parts) {
	            System.out.println(part);
	        }
	    }
	}

