// -----------------------------------------------------
// Assignment number 2
// Part: I
// Written by: Serradj Fouad ID 40009794
// -----------------------------------------------------
package com.fouad.assignment2.Book;

import com.fouad.assignment2.Paperpublication.PaperPublication;

public class Book extends PaperPublication {

	// package access is appropriate since the inherited class are in the same package

	
	 long ISBN ;
	 int year ;
	 String author ;
	
	// default constructor where variables are assigned default values 

	public Book() {
		super();
		this.ISBN = 0 ;
		this.year = 0 ;
		this.author = "no author" ;
	}
	
	// Constructor with parameters defined

	public Book(String title, double price, int page, long isbn, int year, String author) {
		super(title,price,page);
		this.ISBN = isbn ;
		this.year = year ;
		this.author = author ;
	}
	
	
	// Copy constructor
	
	public Book(Book b) {
		super(b);
		this.ISBN = b.ISBN ;
		this.year = b.year ;
		this.author = b.author ;
	}
	
	

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "This book has the following details : \n "
				+"Title : " + this.getTitle() +"\n"
				+"Price : " + this.getPrice() + "\n"
				+"Pages number : " + this.getPage() + "\n"
				+"ISBN : " + ISBN + "\n"
				+"year : " + year + "\n"
				+"author : " + author + "\n" ;
	}
	
	
	public boolean equals(Object b) {
		if(b == null) {
			return false ;
		}
		else if(getClass() != b.getClass()) {
			return false ;
		}
		
		Book bb = (Book)b ;
		return (ISBN == bb.ISBN) && (year == bb.year) && (author.equals(bb.author)) ; 
	}
	
	
	
	
	
	
}
