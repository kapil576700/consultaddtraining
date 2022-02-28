package task1;

import java.util.Scanner;

// to print value given by the user
public class PrintValue {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be printed: ");
		
		int num = sc.nextInt();
		System.out.println("The value entered is "+num);
		sc.close();
	}

}
