package in.neuron.main;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Input String is "+str);
		System.out.println("After removing duplicates: "+removeDuplicates(str));
		
}

	private static String removeDuplicates(String str) {
		
		String newString="";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(newString.indexOf(ch)==-1)
			{
				newString+=ch;
			}
		}
		return newString;
	}
}