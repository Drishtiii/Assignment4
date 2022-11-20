package in.neuron.main;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		countCharacterType(str);
	}
	// Function to count number of vowels, consonant, 
    // and special character in a string.
	private static void countCharacterType(String str) {
		
		int vowel=0, consonant=0, spclChar=0, numbers=0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'B'))
			{
			if((ch=='A')||(ch=='a')||(ch=='E')||(ch=='e')||(ch=='i')
			||(ch=='I')||(ch=='O')||(ch=='o')||(ch=='u')||(ch=='U'))
			{
				vowel++;}
			else
			{
				consonant++;}
			}
			else if(ch >= '0' && ch <= '9')
			{numbers++; }
			else {
				spclChar++;
			}
		}
			System.out.println("No of vowels are: "+vowel);
			System.out.println("No of consonants are: "+consonant);
			System.out.println("No of spcl characters are: "+spclChar);
			
		}
	}