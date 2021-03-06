//Name: BookTest.java
//Purpose: Implementation of a book class
//Author: Wendy Prayer
//Date:12/4/2018


package book;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedList;


public class BookTest {

	// Method catches non-Integers
	public static int integersOnly() {
		Scanner scan = new Scanner(System.in);

		try {

			// User enters page Number

			return scan.nextInt();

		}

		catch (InputMismatchException e) {
			System.out.println("ATTN: Please enter only positive integers.");
			System.out.println("");

			return -1;
		}

	}

	// Method catches nondoubles
	public static double doublesOnly() {
		Scanner scan = new Scanner(System.in);

		try {

			// User enters page Number

			return scan.nextDouble();

		}

		catch (InputMismatchException e) {
			System.out.println("ATTN: Please enter only positive numbers.");
			System.out.println("");

			return -1;
		}

	}

	public static void main(String[] args) {

		LinkedList<Book> myList = new LinkedList<Book>();

		// Introduction
		System.out.println("\tPrayer Book Store");
		System.out.println("----------------------------------------");

		Scanner scan = new Scanner(System.in);

		String serialNumber;
		int pageNumber = 0;
		int copies = 0;
		double bookCost = 0;
		String bookTitle = null;
		String authorName = null;
		boolean yesAnswer;
		boolean noAnswer;
		char response = 'Y';

		do {

			// User enters ISBN
			System.out.print("Enter an ISBN: ");
			serialNumber = scan.nextLine();

			boolean stopPgm = serialNumber.equals("000");

			if (stopPgm != true)

			{
				// User enters title
				System.out.print("Enter book title: ");

				bookTitle = scan.nextLine();

				// User enters author
				System.out.print("Enter author: ");
				authorName = scan.nextLine();

				// User enters page Number
				do {
					System.out.print("Enter number of pages in the book: ");
					pageNumber = integersOnly();

				} while (pageNumber == -1);

				do {
					// User enters price of Book
					System.out.print("Enter the price of the book: ");
					bookCost = doublesOnly();
				} while (bookCost == -1);

				do {
					// User enters Number of copies in stock
					System.out.print("Number of Copies in Stock: ");
					copies = integersOnly();

				} while (copies == -1);

				System.out.println("");
				System.out.print("Would you like to continue? Yes or No (y/n) to Continue.");
				response = scan.nextLine().charAt(0);

			}

			yesAnswer = (response == 'Y') || (response == 'y');
			noAnswer = (response == 'N') || (response == 'n');

			// Breaks Line after while Loop
			System.out.println("");

			Book b = new Book(serialNumber, pageNumber, copies, bookTitle, authorName, bookCost);

			myList.add(b);

		} while (yesAnswer || !(noAnswer));

		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.format("%-18s%-18s%-18s%-18s%-18s%-18s%n", "ISBN", "Title", "Author", "Pages", "Price", "In Stock");
		System.out.println(
				"----------------------------------------------------------------------------------------------------");

		// Prints list of Books and information
		for (Book b : myList) {

			System.out.println(b);

		}

		// Prints Copies sold this week
		System.out.println("");
		System.out.println("Copies Sold This Week:");
		System.out.println("-------------------------------------");

		int copyCount = 0;
		int totalCount = 0;
		double totalSold = 0;
		
		for (Book b : myList)

		{

			String retrieveTitle = b.toStringTitle();

			System.out.print("Enter the number of copies sold for " + retrieveTitle + ": ");
			copyCount = scan.nextInt();
			
			totalCount += copyCount;
			
			totalSold += copyCount * b.price;
			
			int remainingStock = b.getInStock() - copyCount;
			
			b.setInStock(remainingStock);
			
			
			
		}

		
	
		
		
		//Prints out current catalog after subtractions of copies available
		System.out.println("");
		System.out.println("");
		System.out.println("Current Catalog");
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		System.out.format("%-18s%-18s%-18s%-18s%-18s%-18s%n", "ISBN", "Title", "Author", "Pages", "Price", "In Stock");
		System.out.println(
				"----------------------------------------------------------------------------------------------------");

		
		//I need help here!!!!!!

		for (   Book b : myList)

		{
			
			
			System.out.print(b);
			
		}
		
		System.out.println("" );
		System.out.println("Total number of books sold this week: " + totalCount );
		System.out.println("Gross sales this week: $" + totalSold );
		
	}

}
