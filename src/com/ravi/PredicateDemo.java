package com.ravi;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.jar.Attributes.Name;

public class PredicateDemo {
	
	static String[] names = {"Ravi","Vivek","Abhi","Rutu","Raju"};
	
	public static void main(String[] args)  {
		  
		Predicate<Integer>  p = i-> i > 10;
		System.out.println(p.test(5));
		System.out.println(p.test(11));
		
	Predicate<String> p1	 = name -> name.charAt(0)== 'R'; 
		 
			
				for(String name : names) {
					if(p1.test(name)) {
						System.out.println(name);
					}
				}
			
	System.out.println("=======this is bipredicate  =====================");
	
	BiPredicate<Integer, Integer>	bip = (i,j)-> (i+j) > 20;
	
	System.out.println(bip.test(10, 13));
	System.out.println(bip.test(10, 5));
	
	}

}
