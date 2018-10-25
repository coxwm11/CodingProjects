//Program: VendingMachine
//Purpose: Allows user to select item and calculates remaining change or needed purchase amount 
//Author: Wendy Prayer
//Date: 10/16/2018

import java.util.Scanner;
import java.text.NumberFormat;

public class VendingMachine {

	
	public static void main(String[] args) 
	
	{
		
		//Categorizing Items and Variables
	
		String item1, item2, item3, item4,item5, item6;
		
		item1 = "1";
		item2 = "2";
		item3 = "3";
		item4 = "4";
		item5 = "5";
		item6 = "6";
		int userChoice1;
		double userChoice2;
		double changeLeft;
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		
		//User Choice Display
		System.out.println("\t" + "CS 570 Vending Machine");
		System.out.println("1. Chips ------> $1.25");
		System.out.println("2. Candy ------> $1.75");
		System.out.println("3. Cookies ------> $0.75");
		System.out.println("4. Twizzlers ------> $1.50");
		System.out.println("5. Almond Joy ------> $1.00");
		System.out.println("6. Mounds ------> $1.25");
		
		
		//User inputs option and money amount
		
		System.out.println("Enter your choice of item (Select numbers 1 - 6): ");
		Scanner scan = new Scanner (System.in);
		userChoice1 = scan.nextInt();
		
		
			
			
			
		//Error Options for Invalid Selection
		if (userChoice1 > 6) 
			 System.out.println("Invalid Entry. Please try another selection using options 1 - 6.");
		 
		 if (userChoice1 <= 6)
			 
			 System.out.println("Enter money to purchase item: ");
		 	userChoice2 = scan.nextDouble();
		 
		 
		 
		 //Option 1 Settings
		
		if (userChoice1 == 1 && userChoice2 >=1.25) {
	

		//Change Return to customer for Option 1
			changeLeft = userChoice2 - 1.25;
			System.out.print("Thanks for buying Chips.");
			System.out.print(" Your change is " + fmt1.format(changeLeft) + ".");
		}
		
		//Option 1 Settings for insufficient Funds
			double changeNeeded;
			changeNeeded = 1.25 - userChoice2; 
			if (userChoice1 == 1 && userChoice2 < 1.25) 
		
			System.out.println("Insufficient Funds. You are " + fmt1.format(changeNeeded) + " short.");

			
			
			
			
		 
		 
		 // Option 2 Settings
			
		else if  (userChoice1 == 2 && userChoice2 >= 1.75) {


			//Change Return for Option 2
			changeLeft = userChoice2 - 1.75;
			System.out.print(" Thanks for buying Candy. Your change is " + fmt1.format(changeLeft) + ".");
		}
		 		
			//Option 2 Settings for insufficient Funds
			double changeNeeded2;
			changeNeeded2 = 1.75 - userChoice2; 
			if (userChoice1 == 2 && userChoice2 < 1.75) 
		
			System.out.println("Insufficient Funds. You are " + fmt1.format(changeNeeded2) + " short.");

	
			
			
			
			
			
		 
		 // Option 3 Settings
		
		
		else if  (userChoice1 == 3 && userChoice2 >=0.75) {


			//Change Return for Option 3
			changeLeft = userChoice2 - 0.75;
			System.out.print("Thanks for buying Cookies.");
			System.out.print(" Your change is " + fmt1.format(changeLeft) + ".");
		}
		
	
			//Option 3 Settings for insufficient Funds
			double changeNeeded3;
			changeNeeded3 = 0.75 - userChoice2; 
			if (userChoice1 == 3 && userChoice2 < 0.75) 
		
			System.out.println("Insufficient Funds. You are " + fmt1.format(changeNeeded3) + " short.");
		 
		 
			
			
			
			
			// Option 4 Settings
		
		
		else if  (userChoice1 == 4 && userChoice2 >=1.50) {
			//Change Return for Option 3
			changeLeft = userChoice2 - 1.50;
			System.out.print("Thanks for buying Twizzlers.");
			System.out.print(" Your change is " + fmt1.format(changeLeft) + ".");
		}
		
			//Option 4 Settings for insufficient Funds
			double changeNeeded4;
			changeNeeded4 = 1.50 - userChoice2; 
			if (userChoice1 == 4 && userChoice2 < 1.50) 
		
			System.out.println("Insufficient Funds. You are " + fmt1.format(changeNeeded4) + " short.");
		 	 
		 
		
			
			
			
			
			
			
			
			// Option 5 Settings
		
		
		else if  (userChoice1 == 5 && userChoice2 >=1.00) {


			//Change Return for Option 3
			changeLeft = userChoice2 - 1.00;
			System.out.print("Thanks for buying Almond Joy.");
			System.out.print(" Your change is " + fmt1.format(changeLeft) + ".");
		}
		 
		 
			//Option 5 Settings for insufficient Funds
			double changeNeeded5;
			changeNeeded5 = 1.00 - userChoice2; 
			if (userChoice1 == 5 && userChoice2 < 1.00) 
		
			System.out.println("Insufficient Funds. You are " + fmt1.format(changeNeeded5) + " short.");
		 
			
			
			
			
			
			
			
			
			
			
		 
		 // Option 6 Settings
		
		
		else if  (userChoice1 == 6 && userChoice2 >=1.25) {


			//Change Return for Option 3
			changeLeft = userChoice2 - 1.25;
			System.out.print("Thanks for buying Mounds.");
			System.out.print(" Your change is " + fmt1.format(changeLeft) + ".");
		}
		
		
			//Option 6 Settings for insufficient Funds
			double changeNeeded6;
			changeNeeded6 = 1.25 - userChoice2; 
			if (userChoice1 == 6 && userChoice2 < 1.25) 
		
			System.out.println("Insufficient Funds. You are " + fmt1.format(changeNeeded6) + " short.");
		
	
		
		
		
		
	
		
		
		
		
		
	}

}
