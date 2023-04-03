package com.ravi.stream;

import java.util.Arrays;
import java.util.List;

public class MatchingOperation {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Person p1 = new Person("John", "USA");
		Person p2 = new Person("Steve", "UK");
		Person p3 = new Person("Tom", "AUS");
		Person p4 = new Person("Ravi", "India");
		
		List<Person> list = Arrays.asList(p1,p2,p3,p4);
		
		boolean status = list.stream().anyMatch(p -> p.country.equals("India"));
			System.out.println("Any from India : " + status);
			
			boolean status1 = list.stream().anyMatch(p -> p.country.equals("China"));
			System.out.println("Any from China : "+ status1);
		
			boolean status2 = list.stream().allMatch(p -> p.country.equals("India"));
			System.out.println("All from India : " +status2);
			
			boolean status3 = list.stream().noneMatch(p -> p.country.equals("Japan"));
			System.out.println("None from Japan : " +status3);
	}
}

class Person{
	
	String name;
	String country;
	public Person(String name,String country) {
			this.name = name;
			this.country = country;
	}
	
}
