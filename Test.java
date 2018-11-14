//Author: Wendy Prayer
//Purpose: List the media and sorts the media by ratings
//Date: November 12, 2018
//Program: Test.java

package mediaLibrary;
import java.util.Arrays;
import java.lang.Comparable;

public class Test {
	


	public static void main(String[] args) {
		
		
		
		Media [] infoList = new Media[14];

		
		infoList[0] = new Book("A Brief History of Time", 5, "Stephen Hawking", 212 );
		infoList[1] = new Book("A Tale of Two Cities", 4, "Charles Dickens", 262 );
		infoList[2] = new Book ("The Hobbit", 3, "J.R.R. Tolkien", 300);
		infoList[3] = new Book ("The Alchemist", 4, "Paul Coelho", 208);
		infoList[4] = new Movie ("Harry Potter and the Sorcerer's Stone",5, "Chris Columbus" );
		infoList[5] = new Movie ("Up", 5, "Pete Docter and Bob Peterson");
		infoList[6] = new Movie ("Pride and Prejudice", 4, "Joe Wright");
		infoList[7] = new Picture("Cats.jpg", 5, 200);
		infoList[8] = new Picture("Arch.jpg", 3, 300);
		infoList[9] = new Picture("Towers.jpg", 2, 100);
		infoList[10] = new Picture("Flowers,jpg", 5, 400);
		infoList[11] = new Music("You're Still the One", 5, "Shania Twain");
		infoList[12] = new Music("Eye of the Tiger", 3, "Survivor");
		infoList[13] = new Music("Yellow Submarine", 5, "The Beatles");
		
	
			
		
		//intro title
		System.out.println("\t \t \t \tMedia in our library");
		System.out.println("===============================================================================");
		
		 
	     
	     
		
		//Invoke the display method
		 for (int i = 0; i < infoList.length; i++)
		 {
			 infoList[i].display();
		 }
		
		
		 System.out.println("===============================================================================");
			
		 
		 System.out.println("");
		 System.out.println("");
		 
		 
		//intro title for sorted list
			System.out.println("\t \t \t \tAll Media Sorted by Rating");
			System.out.println("===============================================================================");
			
		
		Arrays.sort(infoList);
		
		for (int i = 0; i < infoList.length; i++)
		{
			infoList[i].display();
		}
		System.out.println("===============================================================================");
		

	}

}
