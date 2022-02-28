package task2;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		double a = sc.nextDouble();
		System.out.println("Enter value of b");
		double b = sc.nextDouble();
		System.out.println("Enter value of c");
		double c = sc.nextDouble();
		

		double sum = a + b + c;
		double avg = sum / 3;
		System.out.println("The average is " + avg);

		if (avg > a && avg > b && avg > c) {
			System.out.println("The average is greater than a,b,c");
		} else if (avg > a && avg > b) {
			System.out.println("Average is greater than a,b");
		} else if (avg > a && avg > c) {
			System.out.println("Average is greater than a,c");
		} else if (avg > b && avg > c) {
			System.out.println("Average is greater than b,c");
		} else if (avg > a) {
			System.out.println("Average is greater than just a");
		} else if (avg > b) {
			System.out.println("Average is greater than just b");
		} else if (avg > c) {
			System.out.println("Average is greater than just c");
		}else {
			System.out.println("average is not greater than any input");
		}
		sc.close();
	}

}
