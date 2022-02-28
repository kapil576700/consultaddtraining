package task3;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 values");
		double sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+sc.nextDouble();
		}
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+sum/10);
		sc.close();
	}

}
