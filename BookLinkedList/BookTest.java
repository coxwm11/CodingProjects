package book;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ListIterator;

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

		for (Book b : myList) {

		System.out.println(b);

		}

		
	
		System.out.println("Copies Sold This Week:");
		System.out.println("-------------------------------------");

		int copyCount;
		for (int i = 0; i < myList.size(); i ++)
			
		{	
			
			Book b = new Book(serialNumber, pageNumber, copies, bookTitle, authorName, bookCost);
			String booksTitle = b.getTitle();
			System.out.print("Enter the number of copies sold for " + booksTitle.substring(i)  + ":");
			copyCount = scan.nextInt();
		}
		 

	}

}
