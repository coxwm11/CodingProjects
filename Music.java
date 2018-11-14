//Author: Wendy Prayer
//Purpose: Contains the Music Changes
//Date: November 12, 2018
//Program: Music.java

package mediaLibrary;

public class Music extends Media{
	
	public String artist;
	public String mediaType;
	
	public Music (String theName, int theRating, String theArtist)
	{
		super(theName, theRating);
		
		artist = theArtist; 
	}
	
	//implement display in the child class
	
	public void display()
	{
		mediaType = "Music";
		
		System.out.println(mediaType + ": " + name + " by " + artist + " is rated " + rating + " stars.");
	}

}
