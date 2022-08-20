package variablesmethods;
import java.util.Scanner;
public class Vowel {
	
		
		static String isVowel(char S) {
			if(S=='a' || S=='e' || S=='i' || S=='o' || S=='u') {
				return "true";
			}
			else {
				return "false";
			}
		}
		     public static void main(String args[]) {  
		    	 Scanner input = new Scanner(System.in);
		    	 System.out.println(isVowel('a'));
		    	 System.out.println("Enter your name:");
		    	 String name = input.next();
		    	 int count = 0;
		    	 for (int i=0; i<name.length();i++) {
		    		 if( name.charAt(i)=='a' || name.charAt(i)=='e' ||name.charAt(i)=='i' ||name.charAt(i)=='o' ||name.charAt(i)=='u' ) {
		    			 count++;
		    		 }
		    	 }
		    	 System.out.println("Total no of vowels in string are: " + count);
			}
}
