package com.ravi.extra;

import java.util.Arrays;

public class SumOfArray {
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		
		int reduce = Arrays.stream(num).reduce(2, (a,b)-> a+b);
		System.out.println(reduce);
	}

}
