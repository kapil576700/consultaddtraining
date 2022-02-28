package task3;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number:");
		int num3 = sc.nextInt();
		
		if(num1>num2 && num2>num3) {
			System.out.println("DECREASING ORDER");
		}else if(num1<num2 && num2<num3) {
			System.out.println("INCREASING ORDER");
		}else {
			System.out.println("Neither Increasing nor Decreasing");
		}
		sc.close();
		
	}

}
