package com.ravi;


@FunctionalInterface
interface MyInterfaceTwo{
	
	public void m2();
}

public class MyAppTwo  {
	public static void main(String[] args) {
		
	
     MyInterfaceTwo mi =  ()-> System.out.println("m2 method called");
	  	mi.m2();
	}
}
