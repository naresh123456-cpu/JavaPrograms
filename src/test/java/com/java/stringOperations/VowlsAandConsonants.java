package com.java.stringOperations;

public class VowlsAandConsonants {

	public static void main(String[] args) {
		String str="aeiouz $%^$%   123454";
		 int vCount = 0, cCount = 0,n=0,space=0,specChar=0,even=0,odd=0;
		str.toLowerCase();
		char ch;
		for(int i=0;i<=str.length()-1;i++) {
			ch=str.charAt(i);
			if(str.charAt(i)=='a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				vCount++;
			}else {
				if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
					cCount++;
				}else {
					if(ch>='1' && ch<='9') {
						n++;
						int num=Character.getNumericValue(ch);
						if(num%2==0) {
							even++;
						}else {
							odd++;
						}
					}else {
						if(ch==' ') {
							space++;
						}else {
							specChar++;
						}
					}
					
				}
					
				
			} 
			
		}
		System.out.println(vCount);
		System.out.println(cCount);		
		System.out.println(n);
		System.out.println(space);
		System.out.println(specChar);
		System.out.println(even);
		System.out.println(odd);

	}
}

