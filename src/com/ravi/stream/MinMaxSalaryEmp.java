package com.ravi.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxSalaryEmp {
	public static void main(String[] args) {
		Employee12 e1 = new Employee12("Abhi", " AGRI", 30000);
		Employee12 e2 = new Employee12("Vivek", " Dvop", 50000);
		Employee12 e3 = new Employee12("krishna", " Civil", 40000);
		Employee12 e4 = new Employee12("Nishu", " IT", 55000);
		Employee12 e5 = new Employee12("Hemu", " AI", 35000);
		Employee12 e6 = new Employee12("Shrushti", " DR", 45000);
		Employee12 e7 = new Employee12("Rajju", " DR", 55000);
		Employee12 e8 = new Employee12("Aishu", " Civil", 65000);
		Employee12 e9 = new Employee12("Suresh", " AGRI", 75000);
		
		
	List<Employee12> list = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8,e9);
		//Stream<Employee12> stream = Stream.of(e1,e2,e3,e4,e5,e6);
		System.out.println("============Max salary=================");
		//Optional<Employee12> max = stream.collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		//System.out.println(max.get());
		Optional<Employee12> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("max salary of employee : "+max.get());
		System.out.println();
		System.out.println("============min salary===================");
//		 Optional<Employee12> min = ((Stream<Employee12>) list).collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
//		 	System.out.println(min.get());
		Optional<Employee12> min = list.stream().collect(Collectors.minBy(Comparator.comparing(p -> p.salary)));
			System.out.println("min salary of employee :"+min.get());
			System.out.println();
			Double avg = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
			
			System.out.println("average salary of employee is :" + avg);
			
			System.out.println("================   using groupby  =======================");
			
			Map<String, List<Employee12>> groupby = list.stream().collect(Collectors.groupingBy(e -> e.edep));
			
			System.out.println("employee groupby department :" +groupby);
	}

}

class Employee12{
	
	String ename;
	String edep;
	double salary;
	
	public Employee12(String ename,String edep,double salary) {
		this.ename = ename;
		this.edep = edep;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [ename=" + ename + ", edep=" + edep + ", salary=" + salary + "]";
	}
	
}
