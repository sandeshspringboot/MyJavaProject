package com.java8.FunctionalInterfaceDemo;

import java.math.BigDecimal;
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
		
		Optional<String> ofnullableOptional  = Optional.ofNullable(item1.getName());
		System.out.println(ofnullableOptional);

		System.out.println(Optional.ofNullable(item1.getQty()));
		

	}

}
