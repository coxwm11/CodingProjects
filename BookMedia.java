//Author: Wendy Prayer
//Purpose: This is a child class that represents a type of Media (book)
//Date: November 12, 2018
//Program: Book.java

package mediaLibrary;

public class Book extends Media {

	public String author;
	public int pages;

	public Book(String theName, int theRating, String theAuthor, int thePages) {

		super(theName, theRating);
		author = theAuthor;
		pages = thePages;

	}

	// implement display() in the child class
	public void display() {
		final String mediaType = "Book";

		System.out.println(mediaType + ": " + name + " by " + author + ", " + pages + " pages, " + "is rated " + rating
				+ " stars.");

	}

}
