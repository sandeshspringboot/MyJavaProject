package com.java8.FunctionalInterfaceDemo;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Interface BinaryOperator<T> extends BiFunction<T,T,T>
		 * Type Parameters:
		 * T - the type of the operands and result of the operator.
		 * 
		 * 
		 * Represents an operation(+,-,*,/) upon two operands of the same type,
		 * producing a result of the same type as the operands.
		 * This is a specialization of BiFunction for the case w
		 * here the operands and the result are all of the same type.	
		 * 
		 */
		BinaryOperator<Integer> addTwoNumber=(x,y)->x+y;
		int addition=addTwoNumber.apply(10, 20);
		System.out.println(addition);
		
		BinaryOperator<Integer> multiplyTwoNumber=(x,y)->x*y;
		int multiplication=multiplyTwoNumber.apply(10, 20);
		System.out.println(multiplication);
		
		//Chaining function
		Function<Integer,Integer> squareOfNumber=x->x*x;
		int squareN=addTwoNumber.andThen(squareOfNumber).apply(20,10);
		System.out.println("Square of number after addition of two number :"+squareN);
	}

}
