package com.day4;

public class ProductClassDemo {

	String itemno = null;
	String itemname = null;
	int price;

	public ProductClassDemo() {

		itemno = "item_1001";
		itemname = "Demo item name";
		price = 100;
	}

	public ProductClassDemo(String itemnumber, String itemname, int price) {

		this.itemno = itemnumber;
		this.itemname = itemname;
		this.price = price;
	}
	
	public ProductClassDemo(int price, String itemnumber, String itemname) {

		this.itemno = itemnumber;
		this.itemname = itemname;
		this.price = price;
	}
	

	public String getItemno() {
		return itemno;
	}

	public void setItemno(String itemno) {
		this.itemno = itemno;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
