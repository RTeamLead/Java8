package com.ravi.stream;

import java.util.stream.Stream;

public class ParallelStream {
	public static void main(String[] args) {
		
		Stream<Integer> ss = Stream.of(1,2,3,4,5,6);
		System.out.println("=========== serial stream ================");
		
		ss.forEach(e -> System.out.println(e +" :: "+ Thread.currentThread() ));
		
		System.out.println("=========== parallel stream =============");
		
		Stream<Integer> ps = Stream.of(1,2,3,4,5);
		
		ps.parallel().forEach(i -> System.out.println(i + "::"+ Thread.currentThread()));
		
	}

}
