package com.java8.FunctionalInterfaceDemo;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Example of Sequential Stream
		
		/*List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
		listOfNumbers.stream().forEach(number ->
		    System.out.println(number + " " + Thread.currentThread().getName())
		);*/
		
		//Example of Parallel Stream
		
		List<Integer> listOfNumbers1 = Arrays.asList(1, 2, 3, 4);
		listOfNumbers1.parallelStream().forEach(number ->
		    System.out.println(number + " " + Thread.currentThread().getName())
		);

	}

}
