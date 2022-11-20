package in.neuron.main;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int length = str.length();
		
		String revString="";
		for(int i=(length-1);i>=0;i--)
		{
			revString=revString+str.charAt(i);
		}
		System.out.println("Reversed String is "+revString);
		
		if(str.toLowerCase().equals(revString.toLowerCase())){
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
	}

}
