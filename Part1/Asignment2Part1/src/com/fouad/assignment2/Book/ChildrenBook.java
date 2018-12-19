// -----------------------------------------------------
// Assignment number 2
// Part: I
// Written by: Serradj Fouad ID 40009794
// -----------------------------------------------------
package com.fouad.assignment2.Book;

public class ChildrenBook extends Book {

	// package access is appropriate since the inherited class are in the same package

	 int age ;
	
	public ChildrenBook() {
		super();
		this.age = 0;
	}
	
	public ChildrenBook(String title, double price, int page, long isbn, int year, String author, int age) {
		super(title,price,page,isbn,year,author);
		this.age = age ;
	}
	
	public ChildrenBook(ChildrenBook c) {
		super(c);
		this.age = c.age ;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString() {
		return "This Children book has the following details : \n "
				+"Title : " + this.getTitle() +"\n"
				+"Price : " + this.getPrice() + "\n"
				+"Pages number : " + this.getPage() + "\n"
				+"ISBN : " + this.getISBN() + "\n"
				+"year : " + this.getYear() + "\n"
				+"author : " + this.getAuthor() + "\n"
				+"Age : " + this.age + "\n" ;
	}
	
	public boolean equals(Object o) {
		if(o == null) {
			return false ;
		}
		else if(getClass() != o.getClass()) {
			return false;
		}
		
		ChildrenBook cb = (ChildrenBook)o ;
		
		return (age == cb.age) ;
	}
	
	
	
}
