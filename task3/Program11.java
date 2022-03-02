package task3;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first floating number");
		float num1 = sc.nextFloat();
		System.out.println("Enter second floating number");
		float num2 = sc.nextFloat();
		
		if(Math.abs(num1-num2)<0.01) {
			System.out.println("They are same");
		}else {
			System.out.println("They are not same");
		}
		sc.close();
	}

}
