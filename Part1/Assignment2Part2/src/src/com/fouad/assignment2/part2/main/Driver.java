// -----------------------------------------------------
// Assignment number 2
// Part: II
// Written by: Serradj Fouad ID 40009794
// -----------------------------------------------------
package src.com.fouad.assignment2.part2.main;

import src.com.fouad.assignment2.part2.Book.Book;
import src.com.fouad.assignment2.part2.Book.ChildrenBook;
import src.com.fouad.assignment2.part2.Book.EducationalBook;
import src.com.fouad.assignment2.part2.Journal.Journal;
import src.com.fouad.assignment2.part2.Magazine.Magazine;
import src.com.fouad.assignment2.part2.Magazine.Magazine.frequency;
import src.com.fouad.assignment2.part2.Magazine.Magazine.quality;
import src.com.fouad.assignment2.part2.Paperpublication.PaperPublication;

public class Driver {
	
	/** PART II of the assignment **/ 
	
	static public PaperPublication[] copyBooks(PaperPublication[] Arr) {
		
		PaperPublication[] Copy = new PaperPublication[Arr.length];
		int y = 0 ; // index of the Copy array
		
		for(int x = 0; x < Copy.length ; x++) {
			
			
			if(Arr[x] instanceof Book) {
				Book temp = new Book((Book) Arr[x]);
				Copy[y] = temp ;
				y++ ;
			}
			/*
			else {
				PaperPublication temp2 = (Book) new PaperPublication(Arr[x]) ;
				Copy[y] = temp2 ;
				y++ ;
			}
			/*This part of the program shows the try of casting the PaperPublications class to book and then the display of the runtime error
			of the casting error
			Exception in thread "main" java.lang.ClassCastException: 
			com.fouad.assignment2.Paperpublication.PaperPublication cannot be cast to com.fouad.assignment2.Book.Book
			that s what will result in a difference between the returned Array and the passed Array of the method
			*/
		}
		
		
		PaperPublication[] final_copy = new PaperPublication[y];
		
		for(int i = 0; i < final_copy.length ; i++) {
			final_copy[i] = Copy[i];
		}

		return final_copy ;
	}
	
	
	/** PART I of the assignment */
	
	// creating an array of 15 paper publications
	

	
	
	public static void main(String[] args) {

		PaperPublication paperPub1 = new PaperPublication() ;
		PaperPublication paperPub2 = new PaperPublication("Title of publication 1", 200.99, 250) ;
		PaperPublication paperPub3 = new PaperPublication(paperPub2) ;


	

		// creation of 3 Books using different constructors
		
		Book book1 = new Book();
		Book book2 = new Book("Book title 1", 299.99, 190, 1000000000, 2010, "Dahman harrachi" );
		Book book3 = new Book(book2);
		
		
		
		// creation of 3 children books using different constructors
		
		ChildrenBook childrenBook1 = new ChildrenBook();
		ChildrenBook childrenBook2 = new ChildrenBook("Children Book title 1", 49.99, 100, 1000000001, 2017, "John meyer", 33);
		ChildrenBook childrenBook3 = new ChildrenBook(childrenBook2);
	

		

		// creation of 3 Educational books using different constructors
		
		EducationalBook educative1 = new EducationalBook();
		EducationalBook educative2 = new EducationalBook("Science for children", 89.99, 150, 1000000022, 2018,"Dora string", 4, "Biology");
		EducationalBook educative3 = new EducationalBook(educative2);
		

		Journal journal1 = new Journal();
		Journal journal2 = new Journal("Daily Montreal", 2.99, 32, 9923, "Politics" );
		Journal journal3 = new Journal(journal2);
		

		Magazine magazine1 = new Magazine();
		Magazine magazine2 = new Magazine("Paris match", 19.99, 48, quality.high, frequency.monthly);
		Magazine magazine3 = new Magazine(magazine2);
		
		
		
		PaperPublication paperPub4 = new PaperPublication("Title of publication 2", 499.99, 399) ;
		
		
		Book book4 = new Book("Book title 2", 89.99, 90, 1000000090, 2011, "Mouloud ferahoun" );
				
				
			
		ChildrenBook childrenBook4 = new ChildrenBook("Children Book title 2", 51.99, 110, 1000000201, 2017, "John meyer", 36);
						
					
						
			
		EducationalBook educative4 = new EducationalBook("Science for children 2", 109.99, 170, 1000000222, 2018,"Dora string", 5, "Biology");
								
	
					
		Journal journal4 = new Journal("Daily toronto", 4.99, 42, 9123, "Politics" );

					
					
		Magazine magazine4 = new Magazine("Ricardo", 29.99, 78, quality.high, frequency.monthly);
				
		PaperPublication paperPub5 = new PaperPublication("Paper publication title 4", 500.99, 124) ;
					
		Journal journal5 = new Journal("Gazette",3.99,40,590,"Cuisine");
					
		PaperPublication paperPub6 = new PaperPublication("Paper publication of Mr.Scoffield", 199.99, 1024);

					
	
				
					
					// creating an Array of 12 different objects from all the classes
					
					PaperPublication[] Arr_p = new PaperPublication[12] ;
					
					Arr_p[0] = paperPub2 ;
					Arr_p[1] = book2 ;
					Arr_p[2] = childrenBook2 ;
					Arr_p[3] = educative2 ;
					Arr_p[4] = journal2 ;
					Arr_p[5] = magazine2 ;
					Arr_p[6] = paperPub4 ;
					Arr_p[7] = book4;
					Arr_p[8] = childrenBook4 ;
					Arr_p[9] = educative4;
					Arr_p[10] = journal4 ;
					Arr_p[11] = magazine4;
					
					// creating the array that will handle the returned array
					PaperPublication[] final_array = copyBooks(Arr_p);
					
					
					System.out.println("Here are the content of the array that has 12 elements");
					for(int i=0 ; i< Arr_p.length ; i++) {
						System.out.println(Arr_p[i].toString());
					}

					
					System.out.println("\n Here are the content of the array that has Books and all elements inherited from book");
					for(int i=0 ; i< final_array.length ; i++) {
						System.out.println(final_array[i].toString());
					}
					
					/*
					 * As stated in the implementation of the method CopyBooks the different in the number of the output is 
					 * caused by the fact that upcasting PaperPublication or journal or magazine to book is causing runtime error
					 * thus the number of the resulted array is certainly less than the original 12 elements array
					 */
					
					
	}

}
