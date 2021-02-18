package com.java8.FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create List
		List<Integer> list1=Arrays.asList(2,3,78,23,1,30,9,10);
		//Create Condition
		Predicate<Integer> func=x->x>10;
		List<Integer> listGreterThanTen=list1.stream().filter(func).collect(Collectors.toList());
		System.out.println(listGreterThanTen);
		
		//create new predicate(condition)
		Predicate<Integer> func1=x->x>5;
		System.out.println(func1.test(10));
		
		//create new predicate(condition)
		Predicate<String> func3=str->str.contains("sa");
		System.out.println(func3.test("sandesh"));
		
		////create new predicate(condition)
		Predicate<String> func4=str->str.contains("a") && str.startsWith("S");
		List<String> listOfString=new ArrayList<String>();
		listOfString.add("Sandesh");
		listOfString.add("MITHI");
		listOfString.add("Tithi");
		listOfString.add("Sandy");
		
		//apply the predicate
		List<String> newList=listOfString.stream().filter(func4).collect(Collectors.toList());
		System.out.println(newList);
		
		//negate() in Predicate
		
		List<String> negateList=listOfString.stream().filter(func4.negate()).collect(Collectors.toList());
		System.out.println(negateList);
		
		
		

	}

}
