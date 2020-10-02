import java.util.*;
import java.lang.String;

public class Palindrome{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");

		String userInput = sc.next();
		
		String rev="";
		int strIndex = userInput.length()-1;

		for(int i = strIndex; i >= 0 ;i--){
			rev += userInput.charAt(i);
		}

		System.out.println("reverse: " + rev);
		System.out.println("UserInput: " + userInput);
		
		if(rev.equals(userInput))
			System.out.println("Yes on equals method");
		
		else
			System.out.println("Not a Palindrome");

		sc.close();
	}
}