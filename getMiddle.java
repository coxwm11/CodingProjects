package googlePractice;

import java.util.*;



public class GooglePractice {
	
	public static String getMiddle(String s1) {
		
		int num = s1.length();
		
		String midLetter= null;
		
		int mid;
		
		if(num % 2 != 0 && num> 2){
			
			mid = num/2 ;
			
			midLetter = s1.substring(mid, mid+1);
			
			
		}
		
		else if (num % 2 == 0 && num > 2) {
			
			mid = num/2-1;
			
			midLetter = s1.substring(mid,mid +2);
			
		}
		
		else {
			midLetter = s1;
		}
	
		
		
		return midLetter;
		
		
	}

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter here:");
		
		String word = scan.nextLine();
		
		String line = getMiddle(word);
		
		System.out.println(line);
		
		
		

	}

}
