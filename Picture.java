//Author: Wendy Prayer
//Purpose: Contains the Picture changes
//Date: November 12, 2018
//Program: Picture.java

package mediaLibrary;

public class Picture extends Media{
	
	public int resolution;
	public String mediaType;
	
	public Picture(String theName, int theRating, int theRes)
	
	{
		super(theName, theRating);
		resolution = theRes;
	}
	
	
	//implement display in the child class
	
	public void display()
	{
		mediaType = "Picture";
		
		System.out.println(mediaType + ": " + name + ", " + resolution + " dpi, is rated " + rating + " stars." );
	}

}
