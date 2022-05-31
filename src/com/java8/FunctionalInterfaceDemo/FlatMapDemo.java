package com.java8.FunctionalInterfaceDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
		List<String> productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
		List<List<String>> allproducts = new ArrayList<List<String>>();
		allproducts.add(productlist1);
		allproducts.add(productlist2);
		//allproducts.add(productlist3);
		//allproducts.add(productlist4);
		List<String> flatMapList = allproducts.stream()
				.flatMap(pList -> pList.stream().map(m -> m.toLowerCase()))
				.collect(Collectors.toList());
		System.out.println("Before use of Flatmap ---> "+allproducts);
		System.out.println("*************************************");
		System.out.println("After use of FlatMap ---> "+flatMapList);
		
		//Normal Map
		
		List<String> productlist = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
		List<String> mapList = productlist.stream().map(m -> m.toUpperCase()).collect(Collectors.toList());
		System.out.println("***********************************************");
		System.out.println("Map()----> "+mapList);

	}

}
