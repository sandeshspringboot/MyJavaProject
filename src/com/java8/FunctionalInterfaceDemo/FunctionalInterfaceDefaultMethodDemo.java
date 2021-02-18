package com.java8.FunctionalInterfaceDemo;


@FunctionalInterface
interface First{
	public void showFirst();
	default int add() {
		return 1+1;
	}
	
}
@FunctionalInterface
interface Second{
	public void showSecond();
	default int add() {
		return 1+3;
	}
	
}
interface ThirdNormalInterface{
	//public void showSecond();
	default int add() {
		return 1+3;
	}
	
}

public class FunctionalInterfaceDefaultMethodDemo implements First,Second{
	@Override
	public int add() {//Can not override the default method.
		//Cannot reduce the visibility of the inherited method
		System.out.println(First.super.add());
		System.out.println(Second.super.add());
		return First.super.add();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterfaceDefaultMethodDemo obj= new FunctionalInterfaceDefaultMethodDemo();
		System.out.println(obj.add());

	}

	@Override
	public void showSecond() {
		// TODO Auto-generated method stub
		System.out.println("ShowSecond interfdace");
		
	}

	@Override
	public void showFirst() {
		// TODO Auto-generated method stub
		System.out.println("ShowFirst interfdace");
		
	}

}
