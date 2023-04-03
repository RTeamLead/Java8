package com.ravi.interview.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamInterview {
	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		emp.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		emp.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		emp.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		emp.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		emp.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		emp.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		emp.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		emp.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		emp.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		emp.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		emp.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		emp.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		emp.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		emp.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		emp.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		/*
		 * System.out.println("=============== count no. male and female =============="
		 * ); Map<String, Long> map1 =
		 * emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.
		 * counting())); System.out.println(map1);
		 */

		/*
		 * System.out.println("====== only print department ie distinct");
		 * emp.stream().map(e -> e.department).distinct().forEach(e ->
		 * System.out.println(e));
		 */

		/*
		 * System.out.println("=========== Average age of male and female==========");
		 * Map<String, Double> map2 =
		 * emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.
		 * averagingInt(Employee::getAge))); System.out.println(map2);
		 */

		/*
		 * System.out.
		 * println("===========detail of higest payed employee in organisatn =========="
		 * );
		 * 
		 * Optional<Employee> optional =
		 * emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee
		 * ::getSalary)));
		 * 
		 * if(optional.isPresent()) { Employee employee = optional.get();
		 * System.out.println(employee); }
		 */

		/*
		 * System.out.
		 * println("========= get the employee who joining 2015 ==============");
		 * emp.stream().filter(p -> p.yearOfJoining > 2015).forEach(e ->
		 * System.out.println(e.name));
		 */

		/*
		 * //
		 * System.out.println("=========count no. of employee each department========="
		 * ); // Map<String, Long> map3 =
		 * emp.stream().collect(Collectors.groupingBy(Employee ::
		 * getDepartment,Collectors.counting())); // System.out.println(map3);
		 */

		/*
		 * System.out.println("===== average salary of each department ==========");
		 * Map<String, Double> map4 =
		 * emp.stream().collect(Collectors.groupingBy(Employee
		 * ::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		 * System.out.println(map4);
		 */

		/*
		 * System.out.println("== youngest male in development department ========");
		 * 
		 * Optional<Employee> min = emp.stream().filter(p ->
		 * p.getGender().equals("Male")&& p.getDepartment().equals("Development"))
		 * .min(Comparator.comparing(Employee :: getAge));
		 * 
		 * if(min.isPresent()) { System.out.println(min.get()); }
		 */

		/*
		 * System.out.println("most working experence in organisation");
		 * Optional<Employee> optional1 =
		 * emp.stream().collect(Collectors.minBy(Comparator.comparing(Employee ::
		 * getYearOfJoining)));
		 * 
		 * if(optional1.isPresent()) { System.out.println(optional1); }
		 */

		/*
		 * System.out.println(" no.  of male and female in sales team");
		 * 
		 * Map<String, Long> map5 = emp.stream().filter(p ->
		 * p.getDepartment().equals("Sales")) .collect(Collectors.groupingBy(Employee ::
		 * getGender, Collectors.counting())); System.out.println(map5);
		 */

		/*
		 * System.out.println("average salary of mal and female employee" );
		 * 
		 * Map<String, Double> map6 =
		 * emp.stream().collect(Collectors.groupingBy(Employee ::
		 * getGender,Collectors.averagingDouble(Employee ::getSalary)));
		 * System.out.println(map6);
		 */

		/*
		 * System.out.println("list down the name of employee of each department");
		 * 
		 * Map<String, List<Employee>> map7 =
		 * emp.stream().collect(Collectors.groupingBy(Employee :: getDepartment));
		 * System.out.println(map7);
		 */

		
		/*
		 * System.out.println("employee having higest salary");
		 * 
		 * Optional<Employee> optional3 =
		 * emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee ::
		 * getSalary))); System.out.println(optional3.get());
		 */
		 
				// for 3rd highest salary the skip(2)
				/*
				 * System.out.
				 * println("==============second highest salary=======================");
				 * 
				 * 
				 * Optional<Employee> findFirst =
				 * emp.stream().sorted(Comparator.comparing(Employee ::
				 * getSalary).reversed()).skip(1).findFirst();
				 * System.out.println(findFirst.get());
				 */
		 // second approach to find 2nd highest salary  
		 
		
		List<Employee> list3 = emp.stream().sorted(Comparator.comparing(Employee :: getSalary).reversed())
		.collect(Collectors.toList());
		// get(0)for  highest salary get(1) second highest salary
		System.out.println(list3.get(1));
		
	}

}

class Employee {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}
