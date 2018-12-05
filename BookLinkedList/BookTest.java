package book;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.LinkedList;

public class BookTest {

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
		int serialNumber;
		int pageNumber = 0;
		int copies = 0;
		double bookCost = 0;
		String bookTitle = null;
		String authorName = null;

		do {

			// User enters ISBN
			System.out.print("Enter an ISBN or 000 to stop: ");
			serialNumber = scan.nextInt();

			if (serialNumber != 000)

			{
				// User enters title
				System.out.print("Enter book title: ");

				// flush the Buffer
				String flush = scan.nextLine();
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

			}
			System.out.println("");

			Book b = new Book(serialNumber, pageNumber, copies, bookTitle, authorName, bookCost);

			myList.add(b);

			System.out.println(b.toString());

		} while (serialNumber != 000);

		for (Book b : myList) {
			System.out.println(b);
		}
		// Book takes input from user for isbn, title, author, price, copies available

	}

}
