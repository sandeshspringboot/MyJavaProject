package com.java8.FunctionalInterfaceDemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Represents an operation that accepts a single input argument and returns no result.
		
		Consumer<String> consumeFunction=x->System.out.println(x);
		consumeFunction.accept("Hello");
		
		
		List<String> listOfString=new ArrayList<String>();
		listOfString.add("Sandesh");
		listOfString.add("MITHI");
		listOfString.add("Tithi");
		listOfString.add("Sandy");
		listOfString.forEach(consumeFunction);
		
		

	}

}
