package com.ravi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		  Consumer<String> c = (name) -> System.out.println(name +" Wel-Come");
		  
		  c.accept("Ravi");
		  c.accept("Abhi");
		  c.accept("Nishu");
		  
		List<Integer> list = Arrays.asList(10,20,30,40,40);
		
		list.forEach(i -> System.out.println(i));
		  
		 
		
	}

}
