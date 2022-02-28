package task1;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1= sc.nextInt();
		System.out.println("Enter second number");
		int num2= sc.nextInt();
		
		num1= num1+num2;
		num2= num1-num2;
		num1= num1-num2;
		
		System.out.println("The swapped values are: num1= "+num1+" num2= "+num2);
		sc.close();
	

	}

}
