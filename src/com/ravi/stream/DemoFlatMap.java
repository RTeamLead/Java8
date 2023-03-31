package com.ravi.stream;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;

public class DemoFlatMap {
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,3,4,5);
		List<Integer> l2 = Arrays.asList(1,2,3,5);
		
		List<List<Integer>> list = Arrays.asList(l1,l2);
		
		list.stream().flatMap(n -> n.stream()).filter(i -> i %2 ==0)
					.forEach(i -> System.out.println(i));
		
//		list.stream().flatMap(n -> n.stream()).filter(i -> i %2 ==0)
//		.collect)
	}

}
