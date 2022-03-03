package task5;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String sentence: ");
		String str= sc.nextLine();
		StringBuilder newstr = new StringBuilder(str);
		for(int i=0; i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}else if(Character.isUpperCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(newstr);
		sc.close();
	}

}
