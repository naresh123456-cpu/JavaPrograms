package com.java.stringOperations;

public class StringReverseUsingCharArray {

	public static void main(String[] args) {
		String str="ABCD";
		String rev="";
		/*char a[]=str.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}*/
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}
}
