package task2;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		String character= sc.next();
		String str="random";
		
		if(str.contains(character.toLowerCase())) {
			System.out.println("FOUND");
		}else {
			System.out.println("NOT FOUND");
		}
		sc.close();
	}

}
