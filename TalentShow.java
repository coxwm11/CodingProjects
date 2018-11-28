//Author: Wendy Prayer
//Date: 11/2/18
//Purpose:Calculates votes and keeps and array of contestants 
//Program: TalentShow



import java.util.Arrays;
import java.util.Scanner;

public class TalentShow {
	
	 
	//Method that displays a table with contestants' names and their codes
	public static void printArray(String[] nameNumber,int[] codeNumber)
	{
		for( int i = 0; i<nameNumber.length; i++)
		{
			System.out.format("%-10s%8s%n", nameNumber[i], codeNumber[i]);
			
		}
	}

	
	//Method that displays a table with the names and votes received 
	public static void voteCounts(String[] nameNumber, int [] voteEntry)
	{
		for( int i = 0; i<nameNumber.length; i++)
		{
			System.out.format("%-10s%8s%n", nameNumber[i], voteEntry[i]);
			
		}
			
	}
	
	
	//Method that figures out and returns the name of the winner.
	public static int finalWinner(int[] winner)
	{ 
		//int max = winner[0];
		int max = 0;
		
	 	for (int i=1; i < winner.length; i++)
	 	{
	 		
	 			if(winner[0]< winner[i])	
	 		
	 			
	 			max = i;
	
	 					
		
	 	}
	 	
		return max;
		
	}
	

	

	

	public static void main(String[] args) {
		
		 int SIZE = 10;
		
		    
		    //Array for Names
			String [] contestantNames = new String [SIZE];
			
			contestantNames[0] = "Abigail";
			contestantNames[1] = "Ben";
			contestantNames[2] = "Carla";
			contestantNames[3] = "David";
			contestantNames[4] = "Ella";
			contestantNames[5] = "Fred";
			contestantNames[6] = "Grace";
			contestantNames[7] = "Hector";
			contestantNames[8] = "Irene";
			contestantNames[9] = "Jerry";
			
			//Array of integers for Codes
			int [] contestantCode = new int [SIZE];
			contestantCode[0] = 1;
			contestantCode[1] = 2;
			contestantCode[2] = 3;
			contestantCode[3] = 4;
			contestantCode[4] = 5;
			contestantCode[5] = 6;
			contestantCode[6] = 7;
			contestantCode[7] = 8;
			contestantCode[8] = 9;
			contestantCode[9] = 10;
		
			
			System.out .println("Contestant\t" + "Code");
			System.out.println("-------------------------");
			
			//Prints the Names and Codes	
			printArray(contestantNames, contestantCode);
			System.out.println("");
			
		

			//Array for votes
			 int voteInputs;
			 String response;
			 int [] counter = new int [SIZE];
			
			 
			 Scanner scan = new Scanner(System.in);
			
				do 
				{
					System.out.println("Enter the number of the contestant you want to vote for:");
			
					voteInputs = scan.nextInt();
					
					
					
					
					
					do {
					if(voteInputs < 1 || voteInputs > 10)
					{
						System.out.println("Contestant code must be a value between 1 and 10. Try again.");
			
						System.out.println("Enter the number of the contestant you want to vote for:");
						voteInputs = scan.nextInt();
						
					}
						}while(voteInputs<1 || voteInputs > 10); 
						
						
					//Counts Votes
					counter[ voteInputs - 1 ]++;
					
					
					
					//Asks User if they want to cast more votes.
					System.out.println("Are there more votes to process (y/n)?");
					
					
					
					//Clears the buffer
					response = scan.nextLine();
					
					
					//Receives the 'yes' or 'no' response
					response = scan.nextLine();
				}while(response.charAt(0)=='y'|| response.charAt(0)=='Y');
						
				
				
			
			//Header for table
			System.out.println("");
			System.out.print("--------");
			System.out.format("%10s", "TotalVotes");
			System.out.println("-----------");
			System.out.println("");
			
			//Method that displays names and returns vote counts
			voteCounts(contestantNames, counter);
			
			
			//Method the calculates most votes
			int highVote = finalWinner(counter);
			
		
			
			
			System.out.println("");
			
			
	
			System.out.println("And the winner is:" + contestantNames[highVote]);
			
			
			
		
		
			
			
			
			
	}

}
