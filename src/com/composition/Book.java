package com.composition;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;
	public Book(String name, Author[] authors, double price) {
		super();
		this.name = name;
		//this.authors = authors;
		this.price = price;
	}
	public Book(String name, Author[] a, double price, int qty) {
		super();
		this.name = name;
		//this.authors = authors;
		this.price = price;
		this.qty = qty;
		authors = new Author[a.length];
		for(int i=0;i<authors.length;i++) {
			authors[i] = new Author(a[i].getName(),a[i].getEmail(),a[i].getGender());
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public String getAuthorNames() {
		String authorNames="";
		for(int i=0;i<authors.length;i++) {
			authorNames = authorNames+authors[i].getName()+",";
		}
		return authorNames;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + getAuthorNames() + " price=" + price + ", qty=" + qty + "]";
	}
	
	
}
