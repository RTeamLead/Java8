package com.ravi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



class Employee{
	String name;
	String city;
	String department;
	
	public Employee( String name,String city,String department) {
		this.name = name;
		this.city = city;
		this.department = department;
	}
}

public class PredicateEmployeeDemo {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ravi", "Pune", "Devloper");
		Employee e2 = new Employee("Aavi", "Mumbai", "test");
		Employee e3 = new Employee("Raju", "Pune", "Ele");
		Employee e4 = new Employee("Vivek", "Pune", "Support");
		Employee e5 = new Employee("Abhi", "Noida", "Agri");
		
			List<Employee> emp =	Arrays.asList(e1,e2,e3,e4,e5);
			
		Predicate<Employee> p1	= e -> e.city.equals("Pune");
		Predicate<Employee> p2	= e -> e.department.equals("Ele");
		Predicate<Employee> p3	= e -> e.name.startsWith("R");
		
		
	Predicate<Employee> p	= p1.and(p2).and(p3);
	for(Employee e : emp) {
		if(	p.test(e)) {
			
			System.out.println(e.name);
		}
	}
		
	}
}
