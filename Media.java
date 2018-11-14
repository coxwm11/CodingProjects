// Author: Wendy Prayer
// Purpose: This is the abstract class used as a parent to derive name and rating 
// Date: November 12, 2018
// Program: Media.java

package mediaLibrary;

import java.lang.Comparable;
import java.util.Arrays;

public abstract class Media implements Comparable<Media> {

	public String name;
	public int rating;
	public String mediaType;

	// constructor
	public Media(String theName, int theRating) {
		name = theName;
		rating = theRating;

	}

	// abstract method
	public abstract void display();
	

	public String getMediaType() {
		return mediaType;
	}

	public int getRating() {
		return rating;
	}

	public String toString() {
		return mediaType + ": " + name + " is rated " + rating + " stars.";
	}

	
	
	//Uses the comparable interface
	public int compareTo(Media other) {
		if (rating > other.getRating()) {
			return -1;

		}

		else if (rating == other.getRating()) {
			return 0;
		}

		else {
			return 1;
		}
	}

}
