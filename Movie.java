//Author: Wendy Prayer
//Purpose: This is a child class that represents a type of Media (book)
//Date: November 12, 2018
//Program: Movie.java

package mediaLibrary;

public class Movie extends Media {
	
	public String director;
	public String mediaType;

	public Movie(String theName, int theRating, String theDirector) 
	{
		
		super(theName, theRating);
		director = theDirector;
			
	}
	
	//implement display() in the child class
		public void display()
		{
			mediaType= "Movie";
			
			System.out.println(mediaType +": " + name + " by " + director + ", "   + "is rated " + rating + " stars." );
			
		}
	
	
	
	
	
}
