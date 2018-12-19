// -----------------------------------------------------
// Assignment number 2
// Part: II
// Written by: Serradj Fouad ID 40009794
// -----------------------------------------------------
package src.com.fouad.assignment2.part2.Paperpublication;

public class PaperPublication {

	/*
	 *  private for that class will not allow the other classes from the same package to access the variables (before it was packages restrictive and
	only the inherited classes were not able to access the variables )  the use of getters and setters is mandatory 
	*/
	
	private String title ;
	private double price ;
	private int page ;
	
	// default constructor where variables are assigned default values 
	
	public PaperPublication() {
	
		this.title = "no title";
		this.price = 0.0 ;
		this.page = 0 ;
	
	}
	
	// Constructor with parameters defined
	
	public PaperPublication(String title, double price, int page) {
		
		this.title = title ;
		this.price = price ;
		this.page = page ;
		
	}
	
	// Copy constructor
	
	public PaperPublication(PaperPublication p) {
		
		this.title = p.title ;
		this.price = p.price ;
		this.page = p.page ;
		
	}
	
	// generating getters and setters with public access so package and inherited classes will access only but also if for
	// example we have another class that is composed by some features of this class he can access it


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "This paper publication has the following details : \n"
				+ "Title : " + this.title +"\n"
				+ "Price : " + this.price + "\n"
				+ "Pages number : " + this.page + "\n";
	}
	
	
	// equal method that will test equality between two paper publications
	public boolean equals(Object b) {
		
		if(b == null) {
			return false ;
		}
		else if(getClass() != b.getClass()) {
			return false ;
		}
		
		PaperPublication op = (PaperPublication)b ;
		return (title.equals(op.title)) && (price == op.price) && (page == op.page) ;
		
	}
	
	

	
	
}
