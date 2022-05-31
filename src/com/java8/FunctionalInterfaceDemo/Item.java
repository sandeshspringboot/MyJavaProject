package com.java8.FunctionalInterfaceDemo;

import java.math.BigDecimal;

public class Item {
	
	private String name;
	private BigDecimal price;
	private Integer qty;
	
	
	public Item(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}


	public Item(String name,  Integer qty, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
		this.qty = qty;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public Integer getQty() {
		return qty;
	}


	public void setQty(Integer qty) {
		this.qty = qty;
	}


	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}


	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
