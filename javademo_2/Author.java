package com.org.gen.day1;

public class Author {
	String firstName;
	String lastName;
	
public Author(String f,String l) {
	firstName = f;
	lastName = l;
	
}
void display() {
	System.out.println("Name = "+firstName+" "+lastName);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("Sourav", "Bulbule");
		a1.display();
	}

}
