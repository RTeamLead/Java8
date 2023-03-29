package com.ravi;

@FunctionalInterface
interface MyInterface1{
	 public void m1();
	
}


public class MethodRef {
	public static void m2() {
		System.out.println("m2 in methodRef class...");
	}
	public static void main(String[] args) {
		
		MyInterface1 i1 = MethodRef::m2;
		i1.m1();
		
		
	}

}
