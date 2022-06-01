package com.java8.FunctionalInterfaceDemo;

import java.math.BigDecimal;
import java.util.TreeSet;

public class TreeSetCompratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Item> treeSet = new TreeSet<Item>(new ItemSortByNameComprator());
		
		Item item1 = new Item("Computer", new BigDecimal("20000"));
		Item item2 = new Item("Calculator", new BigDecimal("1000"));
		Item item3 = new Item("Phone", new BigDecimal("30000"));
		Item item4 = new Item("Laptop", new BigDecimal("50000"));
		Item item5 = new Item("TV", new BigDecimal("20000"));
		
		treeSet.add(item1);
		treeSet.add(item2);
		treeSet.add(item3);
		treeSet.add(item4);
		treeSet.add(item5);
		
		for(Item item : treeSet) {
			System.out.println(item.getName()+"  "+item.getPrice());
		}

	}

}
