//Name: Book.java
//Purpose: Implementation of a book class
//Author: Wendy Prayer
//Date:12/4/2018

package book;

public class Book implements Comparable<Book> {

	int pages, inStock, serialNumber;
	String title, author;
	double price;

	public Book(int isbn, int numberOfPages, int stockNumber, String name, String writer, double cost) {

		serialNumber = isbn;
		pages = numberOfPages;
		inStock = stockNumber;
		author = writer;
		title = name;
		price = cost;

	}

	public int getSerialNumber() {

		return serialNumber;

	}

	public int getPages() {

		return pages;

	}

	public int getInStock() {

		return inStock;

	}

	public double getPrice() {

		return price;

	}

	public String getTitle() {

		return title;

	}

	public String getAuthor() {

		return author;

	}
	
	
	//This prints out the list Come back and format this later
	public String toString(){
		
		return author;
		
	}

	public int compareTo(Book b) {
		if (serialNumber > b.serialNumber) {
			return 1;
		}

		else if (serialNumber < b.serialNumber) {
			return -1;
		} else {
			return 0;
		}
	}

}
