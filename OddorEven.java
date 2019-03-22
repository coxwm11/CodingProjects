package googlePractice;

import java.util.*;



public class GooglePractice {
	
	public static  String OddorEven(int[] array) {
		
		
			int count = 0;
			String oddOrEven = null;
			
			for (int i = 0; i < array.length; i++) {
				
				int sum = array[i];
				
				count = count + sum;
				
				if(count %2 == 0) {
					
					 oddOrEven = "even";
				}
			
				else oddOrEven = "odd";
				
			}
			
		
		
		
		
		return oddOrEven;
	
		
	}

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {10,20,30,40,51};
		
		
		String ooe = OddorEven(arr);
		
		System.out.print(ooe);
		
		
		

	}

}
