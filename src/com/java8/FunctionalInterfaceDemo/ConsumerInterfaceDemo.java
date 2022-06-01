package com.java8.FunctionalInterfaceDemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Represents an operation that accepts a single input argument and returns no result.
		
		Consumer<String> consumeFunction = x -> System.out.println(x);
		consumeFunction.accept("Hello");
		
		Consumer<String> consumeFunction1 = x -> {
			if(x.contains("d"))
			System.out.println(x+" contains d ");
		};
		//consumeFunction1.accept("Sandesh");
		
		List<String> listOfString=new ArrayList<String>();
		listOfString.add("Sandesh");
		listOfString.add("MITHI");
		listOfString.add("Tithi");
		listOfString.add("Sandy");
		//forEach method to accept Consumer as an argument;
		listOfString.stream().forEach(consumeFunction1);
		
		
		//andThen()
		
		Consumer<List<Integer> > modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
 
        // Consumer to display a list of integers
        Consumer<List<Integer> >
            dispList = list -> list.stream().forEach(a -> System.out.println(a + " "));
 
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);
 
        // using addThen()
        Consumer<List<Integer> > resultList = modify.andThen(dispList);
        resultList.accept(list);
        ;
        //2nd Example andThen
    	Consumer<String> firstC = x -> System.out.println(x.toLowerCase());
	    Consumer<String> secondC = y -> System.out.println(y.toUpperCase());
	 
	    Consumer<String> result = firstC.andThen(secondC);
	 
	    result.accept("Arpit");
		
		

	}

}
