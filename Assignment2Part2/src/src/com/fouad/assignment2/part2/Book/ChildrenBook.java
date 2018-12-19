// -----------------------------------------------------
// Assignment number 2
// Part: II
// Written by: Serradj Fouad ID 40009794
// -----------------------------------------------------
package src.com.fouad.assignment2.part2.Book;

public class ChildrenBook extends Book {

	/* no child class is created for that class. for other classes in the same package, they won t be able to retrieve the variable 
	 * the use of getters and setters is mandatory 
	 */
	private int age ;
	
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
