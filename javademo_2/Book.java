package com.org.gen.day1;

public class Book {
	String title;
	String author;
	double price;

public Book(String title,String author, double price) {
	this.title = title;
	this.author = author;
	this.price = price;
}
void display() {
	System.out.println("Title="+title+", "+"Author="+author+", "+"Prize="+price);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("My Name", "Sam", 2500);
		Book b2 = new Book("Your life", "John", 1500);
		b1.display();
		b2.display();
	}

}
