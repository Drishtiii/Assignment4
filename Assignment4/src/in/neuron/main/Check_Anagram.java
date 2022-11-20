package in.neuron.main;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Anagram {

	public static void main(String[] args) {
		
		//create an object of Scanner class	
		Scanner sc = new Scanner(System.in);
		
		//take input from users
		System.out.println("Enter first String:");
		String str1=sc.nextLine();
		System.out.println("Enter second String:");
		String str2=sc.nextLine();
		
		//check if length is same
		if(str1.length()==str2.length())
		{
			//convert strings to char array
			char [] charArray1 = str1.toCharArray();
			char [] charArray2 = str2.toCharArray();
			
			//sort the charArray
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//if sorted char arrays are same then the string is anagram
			
			boolean result = Arrays.equals(charArray1, charArray2);
			if(result) {
				System.out.println(str1+" and "+str2+" are anagram");
			}
			else
			{
				System.out.println(str1+" and "+str2+" are not anagram");
			}
	}

}
}