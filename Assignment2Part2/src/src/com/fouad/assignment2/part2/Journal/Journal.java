// -----------------------------------------------------
// Assignment number 2
// Part: II
// Written by: Serradj Fouad ID 40009794
// -----------------------------------------------------
package src.com.fouad.assignment2.part2.Journal;

import src.com.fouad.assignment2.part2.Paperpublication.PaperPublication;

public class Journal extends  PaperPublication{

	/* no child class is created for that class. for other classes in the same package, they won t be able to retrieve the variable 
	 * the use of getters and setters is mandatory 
	 */
	private int issue_nbr ;
	private String speciality_field ;
	
	public Journal() {
		super();
		this.issue_nbr = 0;
		this.speciality_field = "no field";
	}
	
	public Journal(String title, double price, int page,int issue_nbr, String speciality) {
		super(title,price,page);
		this.issue_nbr = issue_nbr ;
		this.speciality_field = speciality ;
	}
	
	public Journal(Journal j) {
		super(j);
		this.issue_nbr = j.issue_nbr ;
		this.speciality_field = j.speciality_field ;
	}

	
	public int getIssue_nbr() {
		return issue_nbr;
	}

	public void setIssue_nbr(int issue_nbr) {
		this.issue_nbr = issue_nbr;
	}

	public String getSpeciality_field() {
		return speciality_field;
	}

	public void setSpeciality_field(String speciality_field) {
		this.speciality_field = speciality_field;
	}

	
	public String toString() {
		return "This Journal has the following details : \n "
				+"Title : " + this.getTitle() +"\n"
				+"Price : " + this.getPrice() + "\n"
				+"Pages number : " + this.getPage() + "\n"
				+"Issue number : " + issue_nbr + "\n"
				+"Speciality field : " + speciality_field + "\n" ;
	}
	
	public boolean equals(Object b) {
		if(b == null) {
			return false ;
		}
		else if(getClass() != b.getClass()) {
			return false ;
		}
		
		Journal jj = (Journal)b ;
		return (issue_nbr == jj.issue_nbr) && (speciality_field.equals(jj.speciality_field)) ; 
	}
	
	
	
	
	
	
}
