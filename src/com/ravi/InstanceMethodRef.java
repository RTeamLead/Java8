package com.ravi;

public class InstanceMethodRef {
	
	public void m1() {
		
		for(int i = 1 ; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		InstanceMethodRef inf =  new InstanceMethodRef();
		
		Runnable r1 = inf::m1;
		
		Thread td = new Thread(r1);
		td.start();
		
	}

}
