package com.ravi.stream;

import java.util.Arrays;
import java.util.List;

public class Spliterator {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Ravi","Abhi","Krishna","Vivek","Rajju");
		
		java.util.Spliterator<String> spliterator = list.stream().spliterator();
		
		spliterator.forEachRemaining(e -> System.out.println(e));
		
	}

}
