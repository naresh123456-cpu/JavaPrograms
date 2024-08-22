package com.java.prractices;

public class TestImmutableString {

	public static void main(String[] args) {
		String s="Naresh";
		s.concat("qa");
		System.out.println(s);
		s=s.concat("QA");
		System.out.println(s);
	  //Once String object is created its data or state can't be changed but a new String object is created.
		
}

}
