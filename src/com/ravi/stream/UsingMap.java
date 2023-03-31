package com.ravi.stream;

import java.util.Arrays;
import java.util.List;

public class UsingMap {
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("abhi","ravi","krishna","vivek","raju","anil");
		
		// legacy way 
		System.out.println("============this is using legacy way==========");
		for(String str : name) {
			System.out.println(str.toUpperCase());
		}
				System.out.println("=============this is using map============");
		name.stream().map(n -> n.toUpperCase()).forEach(na -> System.out.println(na));
		
		name.stream().mapToInt(n-> n.length()).forEach(na -> System.out.println(na));
		
		name.stream()
			.filter(n -> n.startsWith("a"))
			.map(n -> n + "-" + n.length())
			.forEach(na -> System.out.println(na));
	}

}
