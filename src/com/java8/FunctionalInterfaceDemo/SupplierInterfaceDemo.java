package com.java8.FunctionalInterfaceDemo;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> supplier=()->{return 10;};
		int number=supplier.get();
		System.out.println("Number is "+number);
		
		addition(()->"Mithi");

	}
	public static void addition(Supplier<String>text) {
		System.out.println(text.get());
	}

}
