package com.java8.FunctionalInterfaceDemo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");

		Long result = productlist1.stream().collect(Collectors.counting());
		System.out.println("Collectors.counting()--> " + result);

		// Collectors.groupingBy() :-
		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));
		// group by price
		Map<BigDecimal, List<Item>> groupByPriceMap = items.stream()
				.collect(Collectors.groupingBy(Item::getPrice));
		//Same
		/*Map<BigDecimal, List<Item>> groupByPriceMap = items.stream()
				.collect(Collectors.groupingBy(Item::getPrice, Collectors.toList()));*/
		System.out.println(groupByPriceMap);

		// group by price, uses 'mapping' to convert List<Item> to Set<String>
		Map<BigDecimal, Set<String>> setResult = items.stream()
				.collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
		System.out.println(setResult);

		// Count the item name wise
		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		System.out.println(counting);
		
		// Addition of items according to item quntity
		Map<String, Integer> sum = items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty)));
		System.out.println(sum);
		
		


	}

}
