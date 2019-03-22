package googlePractice;

import java.util.*;



public class GooglePractice {
	
	public static void spinWords(String sentence) {
		
		
		//removes spaces, create and array of each word
		String[] revSen = sentence.split("");
		
		 String reverseWord = "";
		
		for (int i = 0; i < revSen.length; i++) {
			
			//goes through array
			
			//wordLen is equal to the length of the string at i position
			String  word = revSen[i];
			
			
			
			// if the word is greater than or equal to a length of 5
			if(word.length() >= 5 ) {
				
				// this goes through the selected word that is greater than 5
				for (int j= word.length()-1; j >= 0; j--) {
					
					reverseWord = reverseWord + word.charAt(j);
					
					System.out.print(reverseWord);
				}
			}
			
			
			
		}
		
		
		
		
	
		
	}

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter here:");
		
		String word = scan.nextLine();
		
		spinWords(word);
		
		

	}

}
