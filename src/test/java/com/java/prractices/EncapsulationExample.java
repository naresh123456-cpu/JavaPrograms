package com.java.prractices;

public class EncapsulationExample {
	

	public static void main(String []args) {
		Test1 e=new Test1();
		e.setName("Naresh");
		System.out.println(e.getName());
	}
}
class Test1{
	
private String name;

public String getName() {
	
	return name;
}

public void setName(String name)
{
	this.name=name;
}
}