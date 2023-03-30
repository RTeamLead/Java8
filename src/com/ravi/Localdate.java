package com.ravi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Localdate {
	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println(d1);
		
		
		
		LocalDate l1 = LocalDate.now();
		System.out.println(l1);
		
		l1 = l1.plusDays(3);
		System.out.println(l1);
		
		l1 = l1.plusMonths(2);
		System.out.println(l1);
		
		l1 = l1.plusYears(2);
		System.out.println(l1);
		
		LocalTime l2 =LocalTime.now();
		System.out.println(l2);
		
		boolean leap = LocalDate.parse("2023-12-23").isLeapYear();
		System.out.println("is leap year :" + leap);
		
		LocalDateTime l3 = LocalDateTime.now();
		System.out.println(l3);
		
		
	}
}
