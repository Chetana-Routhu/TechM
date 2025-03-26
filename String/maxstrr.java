package String;

import java.util.Scanner;

public class maxstrr {
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
	 void strrev(String s) {
		 System.out.println(s);
		 String words[] = s.split(" ");
		 for(String a : words)
		 {
			 StringBuilder sb = new StringBuilder (a);
			 StringBuilder fin = sb.reverse();
			 System.out.print(fin+ " ");
					 
		 }
		 
		 
	 }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("enter the string ::");
	    	String word = sc.nextLine();
	    	
	       
	        maxstrr ob = new maxstrr();
	        //String s = ob.findMaxString(word);
	        //System.out.println(s);
	        ob.strrev(word);
	    }
}
