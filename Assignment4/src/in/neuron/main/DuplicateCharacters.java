package in.neuron.main;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char [] carray =str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(carray[i]==carray[j]) {
					System.out.println(carray[i]+" ");
					break;
				}
			}
		}

	}

}
