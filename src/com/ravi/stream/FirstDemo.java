package com.ravi.stream;

import java.util.Arrays;
import java.util.List;

public class FirstDemo {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,34,41,20,19,25,36);
		 
	list.stream().filter(i -> i >20).forEach(i -> System.out.println(i));
	}

}
