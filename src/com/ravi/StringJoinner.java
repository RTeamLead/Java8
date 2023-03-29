package com.ravi;

import java.util.StringJoiner;

public class StringJoinner {
	public static void main(String[] args) {
		
		StringJoiner sj = new StringJoiner("-");
		sj.add("Ravi");
		sj.add("Abhi");
		sj.add("kabhi");
		sj.add("vivek");
		
		System.out.println(sj);
	}

}
