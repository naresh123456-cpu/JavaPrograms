package com.java.programs;



//Number should be >1
//which should have only two factors one is its own or number 1

public class PrimeNumberCheck {

	public static void main(String[] args) {
		       
   int num=6;
   int count=0;
   
   if(num>1) 
   {
	   for(int i=1;i<=num;i++) {
		   if(num%i==0) {
			   count++;
		   }
	   }if(count==2) {
		   System.out.println("The given nunber is prime number "+num);
	   }else {
		   System.out.println(num+"  is  number is not a prime number");
	   }
   }
   
}
}



