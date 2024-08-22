package com.java.programs;

public class PalindromeNumber {

	public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=323; 
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum) {    
		   System.out.println("Given number is palindrome number ");
		  }
		  else {   
		   System.out.println("Given number is not palindrome");
		  }
		}
}		


