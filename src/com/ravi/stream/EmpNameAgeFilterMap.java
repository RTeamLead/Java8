package com.ravi.stream;

import java.util.Arrays;
import java.util.List;

class Employee{
	
	String name;
	int age;
	double salary;
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
}

public class EmpNameAgeFilterMap {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Abhi", 24, 26000);
		Employee e2 = new Employee("Raju", 34, 20000);
		Employee e3 = new Employee("Kishor", 44, 25000);
		Employee e4 = new Employee("Ravi", 34, 40000);
		Employee e5 = new Employee("Shrushti", 22, 45000);
		Employee e6 = new Employee("Vivek", 35, 50000);
		
		List<Employee> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		list.stream().filter(n -> n.salary > 25000)
				.map(n -> n.name +"- "+n.age)
				.forEach(n -> System.out.println(n));
		
		// second approach
		System.out.println("===========Second approach===============");
		list.stream().filter(n -> n.salary > 25000)
		.forEach(n -> System.out.println(n.name +" " + n.age));
		
		list.stream().filter(p -> p.salary > 25000)
		.filter(p -> p.name.startsWith("A"))
		.forEach(i -> System.out.println(i));
		
		System.out.println("========== other option ===========");
		
		list.stream().filter(p -> p.salary > 25000  && p.name.startsWith("R"))
		.forEach(p -> System.out.println(p));
		
	}

}
