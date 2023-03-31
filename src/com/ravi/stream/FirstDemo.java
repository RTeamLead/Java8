package com.ravi.stream;

import java.util.Arrays;
import java.util.List;

public class FirstDemo {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,34,41,20,19,25,36);
		
		System.out.println("===========using traditional method till   java 1.7===========");
		
		for(Integer i1 : list) {
			if(i1 > 20) {
				System.out.println(i1);
			}
		}
		
		System.out.println("==============using stream==========");
		 
	list.stream().filter(i -> i >20).forEach(i -> System.out.println(i));
		
		System.out.println("====== Name Stars with A========");
	
	List<String> list2 = Arrays.asList("John","Abhi","Akash","Ashok","Raju","krishna");
		list2.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));
	
	}

}
