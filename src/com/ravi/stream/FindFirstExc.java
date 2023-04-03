package com.ravi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirstExc {
public static void main(String[] args) {
		
		Person12 p1 = new Person12("John", "USA");
		Person12 p2 = new Person12("Steve", "UK");
		Person12 p3 = new Person12("Tom", "AUS");
		Person12 p4 = new Person12("Ravi", "India");
		Person12 p5 = new Person12("Abhi", "India");
		
		List<Person12> list = Arrays.asList(p1,p2,p3,p4,p5);
		 System.out.println("=====using findfirst=======");		
		Optional<Person12> findFirst = list.stream().filter(p -> p.country.equals("India"))
				.findFirst();
		
		if(findFirst.isPresent()) {
			System.out.println(findFirst);
		}
		System.out.println("=========using findany=   ==============");
		Optional<Person12> findany	= list.stream().filter(p -> p.country.equals("India"))
				.findAny();
		
		
		if(findany.isPresent()) {
			System.out.println(findany);
		}
			System.out.println("=========== using  collectors==============");
		List<Person12> collect = list.stream().filter(p -> p.country.equals("India")).collect(Collectors.toList());
				System.out.println(collect);
				System.out.println("=============");
				System.out.println("number of person belong to India: "+collect.size());
				
				System.out.println("================");
				// Collect to anther collection the name of person who belong to India
				
				List<String> collect2 = list.stream().filter(p -> p.country.equals("India"))
							.map(f -> f.name)
							.collect(Collectors.toList());
				System.out.println(collect2);
				//collect2.forEach(a -> System.out.println(a));
		}
}
class Person12{
	
	String name;
	String country;
	public Person12(String name,String country) {
			this.name = name;
			this.country = country;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}
	
	
}
