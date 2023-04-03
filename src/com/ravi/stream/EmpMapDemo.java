package com.ravi.stream;

import java.util.Arrays;
import java.util.List;

class Employee1{
	
	String name;
	int age;
	double salary;
	
	public Employee1(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
}

public class EmpMapDemo {
public static void main(String[] args) {
		
		Employee1 e1 = new Employee1("Abhi", 24, 26000);
		Employee1 e2 = new Employee1("Raju", 34, 20000);
		Employee1 e3 = new Employee1("Kishor", 44, 25000);
		Employee1 e4 = new Employee1("Ravi", 34, 40000);
		Employee1 e5 = new Employee1("Shrushti", 22, 45000);
		Employee1 e6 = new Employee1("Vivek", 35, 50000);
		
		List<Employee1> list = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		list.stream().filter(p -> p.salary >= 25000)
		    .map(p -> p.name +" - " + p.age)
		    .forEach(p -> System.out.println(p));
		System.out.println("===================================");
		
		list.stream().filter(p -> p.salary >= 24000)
		.forEach(p -> System.out.println(p.name +" "+p.age));
		}
}
