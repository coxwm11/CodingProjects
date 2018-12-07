
//Name: Book.java
//Purpose: Implementation of a book class
//Author: Wendy Prayer
//Date:12/4/2018


package book;



public class Book implements Comparable<Book> {

	int pages, inStock;
	String title, author, serialNumber;
	double price;

	public Book(String isbn, int numberOfPages, int stockNumber, String name, String writer, double cost) {

		serialNumber = isbn;
		pages = numberOfPages;
		inStock = stockNumber;
		author = writer;
		title = name;
		price = cost;

	}

	public String getSerialNumber() {

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
	
	public void setInStock(int setNumInStock)
	{
		this.inStock = setNumInStock;
	}
	
	//This prints out the list 
	public String toString(){
		
		
		return String.format("%-18s%-18s%-18s%-18d%-18.2f%-18d%n", serialNumber , title ,author, pages, price ,inStock);
		
	} 
	
	
	
	public String toStringTitle()
	{
		return (title);
	}
	
	//Sorts books by price
	public int compareTo(Book b) {
		if (price > b.price) {
			return 1;
		}

		else if (price < b.price) {
			return -1;
		} else {
			return 0;
		}
	}

}
