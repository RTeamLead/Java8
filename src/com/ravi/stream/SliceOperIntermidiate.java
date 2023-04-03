package com.ravi.stream;

import java.util.Arrays;
import java.util.List;

public class SliceOperIntermidiate {
	public static void main(String[] args) {
		
		List<String> list2 = Arrays.asList("Ravi","Vivek","Raju","Abhi","Krishna","Shrushti");
		
		// using limit
		System.out.println("============ using limit ================");
		list2.stream().limit(3).forEach(a -> System.out.println(a) );
		
		// using skip
		
	System.out.println("============= using skip================");
	list2.stream().skip(3).forEach(a -> System.out.println(a));
		
		// using distinct
		System.out.println("============== using distinct===============");
		List<String> list3 = Arrays
				.asList("Ravi","Vivek","Raju","Abhi","Krishna","Shrushti","Krishna","Abhi");
		list3.stream().distinct().forEach(a -> System.out.println(a));
		
	}

}
