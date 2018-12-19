// -----------------------------------------------------
// Assignment number 2
// Part: I
// Written by: Serradj Fouad ID 40009794
// -----------------------------------------------------
package com.fouad.assignment2.main;

import com.fouad.assignment2.Magazine.*;
import com.fouad.assignment2.Magazine.Magazine.frequency;
import com.fouad.assignment2.Magazine.Magazine.quality;
import com.fouad.assignment2.Book.*;
import com.fouad.assignment2.Paperpublication.*;
import com.fouad.assignment2.Journal.*;


public class Driver {
	
	/** PART I of the assignment */
	
	

	public static void main(String[] args) {

		int min_pages = 10000 ;
		int max_pages = 0;
		int index_min = -1, index_max = -1 ;
		
		/*
		 * First test is targeting the different constructors and the toString methods
		 * Creating 3 objects of each class with different constructors and display the info
		 */
		
		// creation of 3 paper publication using different constructors
		PaperPublication paperPub1 = new PaperPublication() ;
		PaperPublication paperPub2 = new PaperPublication("Title of publication 1", 200.99, 250) ;
		PaperPublication paperPub3 = new PaperPublication(paperPub2) ;


		System.out.println("Here is the output of the 3 Paper publications created");
		System.out.print(paperPub1.toString());
		System.out.println();
		System.out.print(paperPub2.toString());
		System.out.println();
		System.out.print(paperPub3.toString());

		System.out.println("******END****** \n");

		// creation of 3 Books using different constructors
		
		Book book1 = new Book();
		Book book2 = new Book("Book title 1", 299.99, 190, 1000000000, 2010, "Dahman harrachi" );
		Book book3 = new Book(book2);
		
		System.out.println("Here is the output of the 3 books created");
		System.out.print(book1.toString());
		System.out.println();

		System.out.print(book2.toString());
		System.out.println();

		System.out.print(book3.toString());

		System.out.println("******END****** \n");

		
		
		// creation of 3 children books using different constructors
		
		ChildrenBook childrenBook1 = new ChildrenBook();
		ChildrenBook childrenBook2 = new ChildrenBook("Children Book title 1", 49.99, 100, 1000000001, 2017, "John meyer", 33);
		ChildrenBook childrenBook3 = new ChildrenBook(childrenBook2);
		
		System.out.println("Here is the output of the 3 children books created");
		System.out.print(childrenBook1.toString());
		System.out.println();

		System.out.print(childrenBook2.toString());
		System.out.println();

		System.out.print(childrenBook3.toString());	

		System.out.println("******END****** \n");

		

		// creation of 3 Educational books using different constructors
		
		EducationalBook educative1 = new EducationalBook();
		EducationalBook educative2 = new EducationalBook("Science for children", 89.99, 150, 1000000022, 2018,"Dora string", 4, "Biology");
		EducationalBook educative3 = new EducationalBook(educative2);
		
		System.out.println("Here is the output of the 3 educational books created");
		System.out.println(educative1.toString());
		System.out.println();

		System.out.println(educative2.toString());
		System.out.println();

		System.out.println(educative3.toString());
		System.out.println("******END****** \n");

		
		// creation of 3 Journal using different constructors
		

		Journal journal1 = new Journal();
		Journal journal2 = new Journal("Daily Montreal", 2.99, 32, 9923, "Politics" );
		Journal journal3 = new Journal(journal2);
		
		System.out.println("Here is the output of the 3 Journal created \n");
		System.out.println(journal1.toString());
		System.out.println();
		
		System.out.println(journal2.toString());
		System.out.println();

		System.out.println(journal3.toString());
		System.out.println("******END****** \n");



		// creation of 3 Magazine using different constructors

		Magazine magazine1 = new Magazine();
		Magazine magazine2 = new Magazine("Paris match", 19.99, 48, quality.high, frequency.monthly);
		Magazine magazine3 = new Magazine(magazine2);
		
		
		System.out.println("Here is the output of the 3 Magazine created \n");
		System.out.println(magazine1.toString());
		System.out.println();
		
		System.out.println(magazine2.toString());
		System.out.println();

		System.out.println(magazine3.toString());
		System.out.println("******END****** \n");

		

		/*
		 * Second test targets the equals methods of the classes 
		 * Will create other objects to test them out
		 * 
		 */
		
		// Testing paper publications (one is equal other is not)
		
		PaperPublication paperPub4 = new PaperPublication("Title of publication 2", 499.99, 399) ;
		
		
		if(paperPub2.equals(paperPub4)) {
			System.out.println("object paperPub 4 is equal to paperPub 2 \n");
		}else {
			System.out.println("object paperPub 4 is not equal to paperPub 2 \n");
		}
		
		
		
		if(paperPub2.equals(paperPub3)) {
			System.out.println("object paperPub 3 is equal to paperPub 2 \n");
	
		}else {
		System.out.println("object paperPub 3 is not equal to paperPub 2 \n");
		}
		
		
		
		// Testing Books (one is equal other is not)
		
		Book book4 = new Book("Book title 2", 89.99, 90, 1000000090, 2011, "Mouloud ferahoun" );
				
				
				if(book2.equals(book4)) {
					System.out.println("object book 4 is equal to book 2 \n");
				}else {
					System.out.println("object book 4 is not equal to book 2 \n");
				}
				
				
				
				if(book2.equals(book3)) {
					System.out.println("object book 3 is equal to book 2 \n");
			
				}else {
				System.out.println("object book 3 is not equal to book 2 \n");
				}
				
				if(book2.equals(paperPub2)) {
					System.out.println("object paperPub 2 is equal to book 2 \n");
			
				}else {
				System.out.println("object paperPub 2 is not equal to book 2 \n");
				}
				
				
				// Testing Children Books (one is equal other is not)
				
				ChildrenBook childrenBook4 = new ChildrenBook("Children Book title 2", 51.99, 110, 1000000201, 2017, "John meyer", 36);
						
						
						if(childrenBook2.equals(childrenBook4)) {
							System.out.println("object childrenbook 4 is equal to childrenbook 2 \n");
						}else {
							System.out.println("object childrenbook 4 is not equal to childrenbook 2 \n");
						}
						
						
						
						if(childrenBook2.equals(childrenBook3)) {
							System.out.println("object childrenbook 3 is equal to childrenbook 2 \n");
						}else {
							System.out.println("object childrenbook 3 is not equal to childrenbook 2 \n");
						}
						
						
						if(childrenBook2.equals(paperPub2)) {
							System.out.println("object paperPub 2 is equal to childrenbook 2 \n");
					
						}else {
						System.out.println("object paperPub 2 is not equal to childrenbook 2 \n");
						}
						
						
		// Testing Educational Books (one is equal other is not)
						
					EducationalBook educative4 = new EducationalBook("Science for children 2", 109.99, 170, 1000000222, 2018,"Dora string", 5, "Biology");
								
								
					
					if(educative2.equals(educative4)) {
					
						System.out.println("object Educative 4 is equal to Educative 2 \n");
					}
					else 
					{	
						System.out.println("object Educative 4 is not equal to Educative 2 \n");	
					}
								
					
					if(educative2.equals(educative3)) {						
						System.out.println("object Educative 3 is equal to Educative 2 \n");					
					}else {							
						System.out.println("object Educative 3 is not equal to Educative 2 \n");							
					}
				
					if(educative2.equals(paperPub2)) {								
						System.out.println("object paperPub 2 is equal to educative 2 \n");															
					}else {								
						System.out.println("object paperPub 2 is not equal to educative 2 \n");								
					}
					
					
	
					// Testing Journal (one is equal other is not)
					
					Journal journal4 = new Journal("Daily toronto", 4.99, 42, 9123, "Politics" );
								
								
					
					if(journal2.equals(journal4)) {
						System.out.println("object journal 4 is equal to journal 2 \n");
					}
					else 
					{	
						System.out.println("object journal 4 is not equal to journal 2 \n");	
					}
					
					
					if(journal2.equals(journal3)) {
						System.out.println("object journal 3 is equal to journal 2 \n");
					}
					else 
					{	
						System.out.println("object journal 3 is not equal to journal 2 \n");	
					}
								
					
				
					if(journal2.equals(paperPub2)) {								
						System.out.println("object paperPub 2 is equal to journal 2 \n");															
					}else {								
						System.out.println("object paperPub 2 is not equal to journal 2 \n");								
					}
					
					
					
			

					// Testing Magazine (one is equal other is not)
					
					Magazine magazine4 = new Magazine("Ricardo", 29.99, 78, quality.high, frequency.monthly);
								
								
					
					if(magazine2.equals(magazine4)) {
						System.out.println("object magazine 4 is equal to magazine 2 \n");
					}
					else 
					{	
						System.out.println("object magazine 4 is not equal to magazine 2 \n");	
					}
					
					if(magazine2.equals(magazine3)) {
						System.out.println("object magazine 3 is equal to magazine 2 \n");
					}
					else 
					{	
						System.out.println("object magazine 3 is not equal to magazine 2 \n");	
					}
					
						
					
				
					if(magazine2.equals(paperPub2)) {								
						System.out.println("object paperPub 2 is equal to magazine 2 \n");															
					}else {								
						System.out.println("object paperPub 2 is not equal to magazine 2 \n");								
					}
				
					/*
					 * Test number 3 : creating an array of 15 publications and then fill it up and displaying the min and the max of paper pages
					 */
					
					// creating some other objects to fill up the array
					
					PaperPublication paperPub5 = new PaperPublication("Paper publication title 4", 500.99, 124) ;
					Journal journal5 = new Journal("Gazette",3.99,40,590,"Cuisine");
					PaperPublication paperPub6 = new PaperPublication("Paper publication of Mr.Scoffield", 199.99, 1024);

					// creating the array of 15 paperpublications
					PaperPublication[] Arr_pp = new PaperPublication[15] ;
					// filling up the array manually
					
					Arr_pp[0] = paperPub2 ;
					Arr_pp[1] = book2 ;
					Arr_pp[2] = childrenBook2 ;
					Arr_pp[3] = educative2 ;
					Arr_pp[4] = journal2 ;
					Arr_pp[5] = magazine2 ;
					Arr_pp[6] = paperPub4 ;
					Arr_pp[7] = book4;
					Arr_pp[8] = childrenBook4 ;
					Arr_pp[9] = educative4;
					Arr_pp[10] = journal4 ;
					Arr_pp[11] = magazine4;
					Arr_pp[12] = paperPub5;
					Arr_pp[13] = journal5;
					Arr_pp[14] = paperPub6;
					
					for(int i=0 ; i < Arr_pp.length ; i++) {
						if(Arr_pp[i].getPage() < min_pages) {
							min_pages = Arr_pp[i].getPage();
							index_min = i ;
						}
					}
					
					for(int j=0 ; j < Arr_pp.length ; j++) {
						if(Arr_pp[j].getPage() > max_pages) {
							max_pages = Arr_pp[j].getPage();
							index_max = j ;
						}
					}
					
					System.out.println("the Paper publication that has the least number of pages is situated at the index : "+index_min+"\n"
							+ "and has the following informations : \n "
							+ Arr_pp[index_min].toString() + "\n" );
							
					
					System.out.println("the Paper publication that has the most number of pages is situated at the index : "+index_max+"\n"
							+ "and has the following informations : \n "
							+ Arr_pp[index_max].toString() + "\n" );

					/** END OF THE PART I OF THE ASSIGNMENT */
					
	
					
					
	}

}
