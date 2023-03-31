package com.ravi.stream;

import java.util.stream.Stream;

public class SecondDemoFilter {
	public static void main(String[] args) {
		 
		User u1 = new User("Jhon", 25); 
		User u2 = new User("Anup", 35); 
		User u3 = new User("Abhi", 30); 
		User u4 = new User("krishan", 22); 
		User u5 = new User("Nishu", 20); 
		User u6 = new User("Hemu", 21); 
		
		
		Stream<User> stream = Stream.of(u1,u2,u3,u4,u5,u6);
		stream.filter(u -> u.age > 20  && u.name.startsWith("A")).forEach(u -> System.out.println(u));
		
	}

}

class User{
	String name;
	int age;
	
	public User( String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
