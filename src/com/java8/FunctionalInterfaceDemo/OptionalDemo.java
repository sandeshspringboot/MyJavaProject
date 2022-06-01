package com.java8.FunctionalInterfaceDemo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item();
		item1.setName("Computer");
		Long ln = 75000L;
		BigDecimal b = BigDecimal.valueOf(ln);
		item1.setPrice(b);
		Optional<String> emptyOptional  = Optional.empty();
		System.out.println(emptyOptional);
		
		/*
		 * Optional<Integer> ofOptional = Optional.of(item1.getQty());
		 * System.out.println(ofOptional);
		 */
		System.out.println("***************************isPresent******************************");
		//isPresent()
		Optional<String> ofnullableOptional  = Optional.ofNullable(item1.getName());
		if(ofnullableOptional.isPresent()) {
			System.out.println(item1.getName().toUpperCase());
			
		}
		else {
			System.out.println("Name is not present");
		}
		System.out.println("**************************isPresent********************************");
		//isPresent()
		Optional<Integer> ofnullableOptional1  = Optional.ofNullable(item1.getQty());
		if(ofnullableOptional1.isPresent()) {
			System.out.println(item1.getQty());
			
		}
		else {
			System.out.println("Quntity is "+ ofnullableOptional1.isPresent()+" present");
		}
		

		System.out.println(Optional.ofNullable(item1.getQty()).isPresent());
		System.out.println("*****************************orElse()*****************************");
		
		//orElse()
		
		String nullName = null;
	    String name = Optional.ofNullable(nullName).orElse("john");
	    System.out.println("Name is "+ name);
	    System.out.println("****************************orElseGet()******************************");

	    // orElseGet()
	    String text1 = null;

	    String defaultText2 = Optional.ofNullable(text1).orElseGet(OptionalDemo::getMyDefault);
	    System.out.println(defaultText2);
	    
	    System.out.println("**************************orElse vs orElseGet********************************");
	    
	    //orElse() vs orElseGet() both are working differently 
	    //when we provide not null value String text = "Text present";
	    
	    String text = "Text present";

	    System.out.println("Using orElseGet:");
	    String defaultText 
	      = Optional.ofNullable(text).orElseGet(OptionalDemo::getMyDefault);
	    System.out.println(defaultText);

	    System.out.println("Using orElse:");
	    String defaultText1 = Optional.ofNullable(text).orElse(getMyDefault());
	    System.out.println(defaultText1);
	    System.out.println("***************************orElseThrow *******************************");
	    
		/*
		 * String nullName1 = null; String name1 =
		 * Optional.ofNullable(nullName1).orElseThrow( IllegalArgumentException::new);
		 */
	    
	    System.out.println("***************************orElse with List *******************************");
	    
	    /*List<String> companyNames = Arrays.asList(
	    	      "paypal", "oracle", "", "microsoft", "", "apple");
	    	    Optional<List<String>> listOptional = Optional.of(companyNames);

	    	    int size = listOptional
	    	      .map(List::size)
	    	      .orElse(0);
	    	    System.out.println("size of list is "+size);*/
	    
	    System.out.println("***************************map and flatMap *******************************");
	    Person person = new Person("john", 26);
	    Optional<Person> personOptional = Optional.of(person);

	    Optional<Optional<String>> nameOptionalWrapper = personOptional.map(Person::getName);
	    Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
	    String name1 = nameOptional.orElse("");
	    System.out.println("Using map: Name is "+name1);

	    String name2 = personOptional.flatMap(Person::getName).orElse("");
	    System.out.println("Using flatMap: Name is "+name2);
	}
	public static String getMyDefault() {
	    System.out.println("Getting Default Value");
	    return "Default Value";
	}

}
