package task2;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;

		try {
		do {
			System.out.println("Good going");
			num = sc.nextInt();
		} while (num > 0);
		}
		catch(Exception e) {
			System.out.println("invalid input");
		}

		System.out.println("It's over");
		sc.close();
	}

}
