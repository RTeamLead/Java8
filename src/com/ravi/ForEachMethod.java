package com.ravi;

import java.util.ArrayList;

public class ForEachMethod {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(5);
		al.add(-1);
		al.add(40);
		
		System.out.println("======= FOR LOOP=============");
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("===========FOR EACH LOOP=============");
		
		for(int i :al) {
			System.out.println(i);
		}
		
		System.out.println("========= FOR EACH method===========");
		
		al.forEach(a -> System.out.println(a));
	}
}
