package com.java8.FunctionalInterfaceDemo;

import java.util.Comparator;

public class ItemSortByNameComprator implements Comparator<Item>{

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	

}
