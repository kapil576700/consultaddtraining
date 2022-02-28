package task1;

import java.util.Scanner;

public class VariableAddition {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x= sc.nextInt();
		System.out.println("Enter second number: ");
		int y= sc.nextInt();
		int z= x+y;
		
		int result= z+30;
		System.out.println("The result is "+result);
		sc.close();
		
	}

}
