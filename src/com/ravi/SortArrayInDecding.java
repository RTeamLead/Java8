package com.ravi;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayInDecding {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(5);
		al.add(-1);
		al.add(40);
		
		Collections.sort(al, (i,j)-> i.compareTo(j));
		System.out.println("Assecdinfg order");
		System.out.println("After sort :" + al);
		System.out.println("decding order...");
		Collections.sort(al,(i,j) -> (i > j)? -1 :1);
		System.out.println("After sort :" + al);
	}

}
