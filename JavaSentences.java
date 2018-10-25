//Program: JavaSentences
//Purpose: Displays answers based on character length
//Author: Wendy Prayer
//Date: 10/12/2018

import java.util.Scanner;


public class JavaSentences {
    public static void main(String args[]) {
        
        //User Inputs Sentence
        
        System.out.println("Enter Sentence: ");
        Scanner scan = new Scanner (System.in);
        String sentence = scan.nextLine();
       
        //Calculation of sentence length and presence of '?'
        int sentenceAmount = sentence.length();;
        int questionMark = sentence.indexOf("?");
        boolean questionReply = questionMark >=1;
        String sentenceOption = ("You always say " + "\"" + sentence + "\"");
        int exclamationMark = sentence.indexOf("!");
        boolean exclamationReply = exclamationMark >= 1;
      
        
        //Printing of statements based on conditions
        if (sentenceAmount % 2 == 0 && (questionReply)) {
        
        	System.out.println("Yes");
       
        }
        
        
        else if (exclamationReply == true){
        	System.out.println("Wow");
        }
             
        else 
        	
        	if (sentenceAmount % 2 != 0 && (questionReply)) {
            
        	System.out.println("No");}
        	
        
        else
        	
            System.out.println(sentenceOption);
        
       
        	
       
        
    }
}
