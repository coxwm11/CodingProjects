// Program:	LoanPayment.java
// Purpose: This program reads a value and calculates Loan Details.
// Author:	Wendy Prayer	
// Date:	10/23/2018


import java.util.Scanner;

import java.text.DecimalFormat;

public class LoanPaymentUpgrade {

	public static void main(String[] args) {
		
		// variables to restart program
		char response = 'Y' ;	//variable to get the while loop restarted

		
		
		while( response == 'Y' || response == 'y' )
		{
		
		
		
		//variables for calculation
		DecimalFormat df1 = new DecimalFormat("0.##");
		double loanAmount;
		final double LOAN_MAX = 1000000;
		final double LOAN_MIN = 0;
		double interestRate;
		final double  INT_MAX = 15;
		final double INT_MIN = 2;
		final double TERM_MIN = 0;
		final double TERM_MAX = 30;
		int loanTerm;
		

		
		System.out.println("\tLoan Payment Calculator");
		System.out.println("*******************************************");
		
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the initial loan amount:");
		loanAmount = scan.nextDouble();
		
	
		//Loan Amount Validation
		while(loanAmount > LOAN_MAX || loanAmount <= LOAN_MIN) 
		{
			if (loanAmount > LOAN_MAX)
				do
				{
				
					System.out.println("The loan amount cannot exceed $1,000,000.00. Try again." );
				
					loanAmount = scan.nextDouble();			
				
				
						}while (loanAmount > LOAN_MAX);
			
		
		
			if (loanAmount <= LOAN_MIN)
				do
		
					{
			
						System.out.println("You must enter a value greater than zero. Try again.");
						
						loanAmount = scan.nextDouble();
						
					}while (loanAmount<= LOAN_MIN);
			
				}
		
		
		
		
		
		
		//Interest Rate Validation
		System.out.println("Enter the annual interest rate (as a percentage):");
		interestRate = scan.nextDouble();
		
		while(interestRate > INT_MAX || interestRate < INT_MIN) 
		{
			if (interestRate > INT_MAX)
				
			do
			{
				
				System.out.println("You must enter a value between 2.0 and 15.0 (inclusive). Try again."  );
				
				interestRate = scan.nextDouble();			
				
				
			}while (interestRate > INT_MAX);
			
		
		
			if (interestRate < INT_MIN)
			do
		
		{
			
				System.out.println("You must enter a value between 2.0 and 15.0 (inclusive). Try again.");
			interestRate = scan.nextDouble();
		}while (interestRate < INT_MIN);
			
		}
		
		
		
		
		

		//Loan Term Validation
		System.out.println("Enter the term of the loan in years:");
		loanTerm = scan.nextInt();
		
		while(loanTerm > TERM_MAX || loanTerm < TERM_MIN) 		
		{
			if (loanTerm > TERM_MAX)
			{
				do
				{
				
					System.out.println("You must enter a value no greater than 30 years. Try again."  );
				
					loanTerm = scan.nextInt();			
				
				
			}while (loanTerm > TERM_MAX);
			
		
				
		}	
		
			if (loanTerm <= TERM_MIN)
			{
			
				do
		
				{
			
				System.out.println("You must enter a value greater than 0. Try again.");
				loanTerm = scan.nextInt();
				
				
				}	while (loanTerm <= TERM_MIN);
			
			
		
			}
		}
		

			
			//Variables for Calculations
			double monthlyPayment;
			double monthlyPayment1;
			double monthlyPayment2;
			double monthlyPayment3;
			double monthlyInterestRate;
			double totalMonthlyPayments;
			double paymentAmount;
			double monthlyInterestPer;
			
		

			//Calculations for monthly payment
			monthlyInterestPer = interestRate/ 100;//changes to a decimal
			monthlyInterestRate = monthlyInterestPer/ 12;// rate divided by 12
			monthlyPayment = (loanAmount * monthlyInterestRate);//amount * rate
			monthlyPayment1= (1)/(1 + monthlyInterestRate);// rate divided by one and added one
			totalMonthlyPayments = loanTerm * 12;//term converted to months
			monthlyPayment2 = Math.pow(monthlyPayment1, totalMonthlyPayments);// result raised to the power of months
			monthlyPayment3 = 1 - (monthlyPayment2);// 1 subtracted from calculations
			paymentAmount = 1+1;
			
			paymentAmount = monthlyPayment / monthlyPayment3;//final result
		
			System.out.println("Your monthly payment is: $" + df1.format(paymentAmount));
			
			
			//Heading for table
			
			System.out.println("");
			
			System.out.print("Month");
			
			System.out.print("\t Interest");
			
			System.out.println("\t Principal");
			
			System.out.println("------------------------------------");
			
			
			//variables for Interest Rate Payment Per Month
			double monthlyInterestPayment;
			double principalAmount;
			double remainingBal;
			
			
			
			//Calculations for monthly Interest Payment
			monthlyInterestPayment = monthlyInterestRate * loanAmount;//10,500 * 0.001875 Step1
			
			
			//Calculations for the principal
			principalAmount = paymentAmount - monthlyInterestPayment;//447.83-19.69 Step2&3
			
			remainingBal = loanAmount - principalAmount;//10,500 - 428.14 Step4
			
			
			
			
					
			
			for (int i = 1; i<= loanTerm*12; i = i+1)
			{
				
				
				System.out.format("%-4s%10.2f%18.2f%n", i, monthlyInterestPayment, principalAmount);
				
				//updates interest Payment
				monthlyInterestPayment = remainingBal * monthlyInterestRate;
				
				
				//updates principal Amount
				principalAmount = paymentAmount - monthlyInterestPayment;
				
				//updates remaining balance
				remainingBal = remainingBal - principalAmount;
				
			
			
			}//end of for loop bracket   
			
			
			//Interest Total Variable
			double totalInterest =  (paymentAmount * totalMonthlyPayments) - loanAmount;
		
			System.out.println("");
			System.out.println("The total amount of interest paid is: " + df1.format(totalInterest));
		
			
			System.out.println("");
			boolean yesAnswer ;
			boolean noAnswer ;
			scan.nextLine(); //flush the input 
			
			
			// Getting user Response

			do 	
			{
			  System.out.print("Do you want to calculate the interest to another loan (y/n)? ") ;
			  response = scan.nextLine().charAt(0); //get the first character

			  
			  yesAnswer = ( response == 'Y' ) || ( response == 'y' ) ;
			  noAnswer = ( response == 'N' ) || ( response == 'n' ) ;

			} while( !( yesAnswer || noAnswer )) ;
				
			System.out.println("");

	
		}
	
		System.out.println("Thank you for using the Loan Interest Calculator. Goodbye!");
	
	}


		
	}

