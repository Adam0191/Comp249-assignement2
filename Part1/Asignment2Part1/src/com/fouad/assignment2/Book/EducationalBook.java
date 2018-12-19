// -----------------------------------------------------
// Assignment number 2
// Part: I
// Written by: Serradj Fouad ID 40009794
// -----------------------------------------------------
package com.fouad.assignment2.Book;

public class EducationalBook extends Book{
	// package access is appropriate since the inherited class are in the same package

	int edition_nbr ;
	 String speciality_field ;
	
	
	public EducationalBook() {
		super();
		this.edition_nbr = 0 ;
		this.speciality_field = "no field" ;
	}
	
	public EducationalBook(String title, double price, int page, long isbn, int year, String author, int edition_nbr, String speciality) {
		super(title,price,page,isbn,year,author);
		this.edition_nbr =  edition_nbr;
		this.speciality_field = speciality;
	}
	
	public EducationalBook(EducationalBook e) {
		super(e);
		this.edition_nbr = e.edition_nbr ;
		this.speciality_field = e.speciality_field ;
	}

	public int getEdition_nbr() {
		return edition_nbr;
	}

	public void setEdition_nbr(int edition_nbr) {
		this.edition_nbr = edition_nbr;
	}

	public String getSpeciality_field() {
		return speciality_field;
	}

	public void setSpeciality_field(String speciality_field) {
		this.speciality_field = speciality_field;
	}
	
	
	public String toString() {
		return "This Educational book has the following details : \n "
				+"Title : " + this.getTitle() +"\n"
				+"Price : " + this.getPrice() + "\n"
				+"Pages number : " + this.getPage() + "\n"
				+"ISBN : " + this.getISBN() + "\n"
				+"year : " + this.getYear() + "\n"
				+"author : " + this.getAuthor() + "\n"
				+"Edition number : " + edition_nbr + "\n"
				+"Speciality field : " + speciality_field + "\n" ;
	}
	
	
	public boolean equals(Object o) {
		if(o == null) {
			return false ;
		}
		else if(getClass() != o.getClass()) {
			return false;
		}
		
		EducationalBook ee = (EducationalBook)o ;
		
		return (edition_nbr == ee.edition_nbr) && (speciality_field.equals(ee.speciality_field));
	}
	
}
