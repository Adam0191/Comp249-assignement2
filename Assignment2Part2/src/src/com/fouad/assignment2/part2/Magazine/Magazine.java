// -----------------------------------------------------
// Assignment number 2
// Part: II
// Written by: Serradj Fouad ID 40009794
// -----------------------------------------------------
package src.com.fouad.assignment2.part2.Magazine;

import src.com.fouad.assignment2.part2.Paperpublication.PaperPublication;

public class Magazine extends PaperPublication{

	/*
	 * enum are put in public so they can be used within the Driver since it is located in another
	 * package (this solution is following my personal implementation, the driver could be placed within the same package and thus
	 * would have packages access instead
	 */
	
	public enum quality{high, normal, low}
	public enum frequency{weekly,monthly,yearly}
	
	/* no child class is created for that class. for other classes in the same package, they won t be able to retrieve the variable 
	 * the use of getters and setters is mandatory 
	 */
	private quality Quality ;
	private frequency Frequency ;
	
	
	public Magazine() {
		super();
		Quality = quality.low ;
		Frequency = frequency.weekly;
	}
	
	public Magazine(String title, double price, int page,quality Quality,frequency Frequency) {
		super(title,price,page);
		this.Quality = Quality ;
		this.Frequency = Frequency ;
	}
	
	public Magazine(Magazine m) {
		super(m);
		this.Quality = m.Quality ;
		this.Frequency = m.Frequency ;
	}

	public quality getQuality() {
		return Quality;
	}

	public void setQuality(quality quality) {
		Quality = quality;
	}

	public frequency getFrequency() {
		return Frequency;
	}

	public void setFrequency(frequency frequency) {
		Frequency = frequency;
	}
	
	

	public String toString() {
		return "This Magazine has the following details : \n "
				+"Title : " + this.getTitle() +"\n"
				+"Price : " + this.getPrice() + "\n"
				+"Pages number : " + this.getPage() + "\n"
				+"Paper Quality : " + Quality + "\n"
				+"Issuing frequency : " + Frequency + "\n" ;
	}
	
	
	public boolean equals(Object b) {
		if(b == null) {
			return false ;
		}
		else if(getClass() != b.getClass()) {
			return false ;
		}
		
		Magazine mm = (Magazine)b ;
		return (Quality == mm.Quality) && (Frequency.equals(mm.Frequency)) ; 
	}
	
	
	

	
	
}
