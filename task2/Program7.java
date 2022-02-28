package task2;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		float num = sc.nextFloat();

		if(num==0) {
			System.out.println("The number is 0");
		}else if(num<0) {
			System.out.println("The number is negative");
		}else {
			if(num>0 && num<1) {
				System.out.println("The number is positive and small");
			}else if(num>1000000) {
				System.out.println("The number is positive and large");
			}else {
				System.out.println("The number is positive");
			}
		}
		sc.close();
	}

}
