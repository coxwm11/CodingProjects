package book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookTest {

	public static void integersOnly(int num)
	{
		Scanner scan = new Scanner(System.in);
	
		
		try {
			
			// User enters page Number
			
			num = scan.nextInt();
			
		}
		
		catch (InputMismatchException e){
			System.out.println("ATTN: Please enter only positive integers.");
			System.out.println("");
			
			
		}
		
		
	}
	
	
	

	public static void main(String[] args) {

		// Introduction
		System.out.println("\tPrayer Book Store");
		System.out.println("----------------------------------------");

		Scanner scan = new Scanner(System.in);
		int serialNumber ;
		int pageNumber = 0;
		int copies =0;
		double bookCost = 0;
		String bookTitle = null;
		String authorName = null;

		// User enters ISBN
		System.out.print("Enter an ISBN or 000 to stop: ");
		serialNumber = scan.nextInt();

		while (serialNumber != 000) {
			

			// User enters title
			System.out.print("Enter book title: ");

			// flush the Buffer
			String flush = scan.nextLine();
			bookTitle = scan.nextLine();

			// User enters author
			System.out.print("Enter author: ");
			authorName = scan.nextLine();

			
			System.out.print("Enter number of pages in the book: ");
			integersOnly(pageNumber);

			// User enters price of Book
			System.out.print("Enter the price of the book: ");
			bookCost = scan.nextInt();

			// User enters Number of copies in stock
			System.out.print("Number of Copies in Stock: ");
			copies = scan.nextInt();

			System.out.println("");

			// User enters ISBN
			System.out.println("Enter an ISBN or 000 to stop: ");
			serialNumber = scan.nextInt();

		}

		//Book takes input from user for isbn, title, author, price, copies available
		
		Book b = new Book(serialNumber, pageNumber,copies, bookTitle, authorName,bookCost);
		
		System.out.println(b.toString());

	}

}
