package com.java8.FunctionalInterfaceDemo;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceApplyMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Interface Function<T,R> Type Parameters:
		 *  T - the type of the input to the function 
		 *  R - the type of the result of the function
		 * 
		 */
		Function<String,Integer> ComputeLengthOfString=str->str.length();
		int len=ComputeLengthOfString.apply("This test for apply()");
		System.out.println(len);
		
		//Chaining function 
		//First Compute the length of string then double the length
		Function<Integer,Integer> DoubleLengthOfString=x->x*2;
		int len2=ComputeLengthOfString.andThen(DoubleLengthOfString).apply("This is new String");		
		System.out.println(len2);
		
		Function<Integer,Integer> cubeOfNumberFunc=x->x*x*x;
		int cubeOfNumber=cubeOfNumberFunc.apply(10);
		System.out.println("Cube of 10 is: "+cubeOfNumber);

	}

}
