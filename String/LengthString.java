package String;

import java.util.Scanner;

public class LengthString {
	 public static String findMaxString(String inputString) {
	       
	        String[] words = inputString.split(" ");
	        
	       
	        String maxWord = words[0];
	        
	       
	        for (String word : words) {
	            if (word.length() > maxWord.length()) {
	                maxWord = word;
	            }
	        }
	        
	        return maxWord;
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	String word = sc.nextLine();
	    	
	       
	        System.out.println("The longest word is: " + word);
	    }
}
