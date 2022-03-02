package task5;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String sentence = sc.nextLine();
		String[] str= sentence.split(" ");
		String nospace="";
		for(int i=0; i<str.length;i++) {
			nospace=nospace+str[i];
		}
		System.out.print("Senterce without space is: "+nospace);
		
	}

}
