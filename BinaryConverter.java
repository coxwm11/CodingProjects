// Program:	Binary Converter
// Purpose: This program converts decimal numbers to Binary values.
// Author:	Wendy Prayer	
// Date:	10/24/2018



import java.util.Scanner;

public class BinaryConverter 
{

	public static int digit(int n)
	{
		int result;
		
		if (n==0)//terminating condition
			
			return 0;
			
		
		else  
			
			return (n % 2 + 10 * digit(n/2));//recursive case	
		
	
	}
	

	
	public static void main(String[] args)
	{
		
		//Get decimal number from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter positive integer:");
		int n = scan.nextInt();
		
		
		
		//Input Validation
		while (n<0) {
			
			System.out.println("Error: You have entered a negative value.Try again.");
	
			 n = scan.nextInt();
		
		
			}while(n<0);
		
		
			System.out.println(digit(n));
				
		}

	}//final bracket
