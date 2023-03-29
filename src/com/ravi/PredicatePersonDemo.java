package com.ravi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	
}

public class PredicatePersonDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ravi", 34);
		Person p2 = new Person("Aavi", 24);
		Person p3 = new Person("Kavi", 30);
		Person p4 = new Person("Davi", 14);
		Person p5 = new Person("Ajay", 24);
		
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		Predicate<Person> pre  = p -> p.age >= 25;
		
		for(Person person : persons) {
			
			if(pre.test(person)) {
				System.out.println(person.name);
				
			}
			
		}
		
		
	}
	
}
