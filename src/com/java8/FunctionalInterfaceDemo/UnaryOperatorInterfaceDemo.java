package com.java8.FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class UnaryOperatorInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Interface UnaryOperator<T> extends Function<T,R>
		 * Type Parameters:
		 * T - the type of the operand and result of the operator.
		 * 
		 * Represents an operation on a single operand 
		 * that produces a result of the same type as its operand. 
		 * This is a specialization of Function for the case where the operand and result are of the same type.
		 * 
		 */
		UnaryOperator<Integer> cubeOfNumberFunc=x->x*x*x;
		int cubeOfNumber=cubeOfNumberFunc.apply(10);
		System.out.println("Cube of 10 is: "+cubeOfNumber);
		
		
		List<String> listOfString=new ArrayList<String>();
		listOfString.add("Sandesh");
		listOfString.add("MITHI");
		listOfString.add("Tithi");
		listOfString.add("Sandy");
		UnaryOperator<String> concanateStr=str->str.concat(" Gadhave");
		listOfString.replaceAll(concanateStr);;
		
		System.out.println(listOfString);
		

	}

}
