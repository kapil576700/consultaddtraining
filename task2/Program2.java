package task2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select an operation from 1,2,3,4,5");
		int option = sc.nextInt();
		
		if(option==1 || option==2 || option==3 || option==4) {
			System.out.println("Enter first number");
			int num1= sc.nextInt();
			System.out.println("Enter second number");
			int num2= sc.nextInt();
			if(option==1) {
			int result = num1+num2;
			if(result >0) {
				System.out.println("The result is "+result);
			}else {
				System.out.println("Oops, the result is negative");
			}
			}else if(option==2) {
				int result = num1-num2;
				if(result >0) {
					System.out.println("The result is "+result);
				}else {
					System.out.println("Oops, the result is negative");
				}
			}else if(option==3) {
				int result = num1*num2;
				if(result >0) {
					System.out.println("The result is "+result);
				}else {
					System.out.println("Oops, the result is negative");
				}
			}else if(option==4) {
				double result = Double.valueOf(num1)/Double.valueOf(num2);
				if(result >0) {
					System.out.println("The result is "+result);
				}else {
					System.out.println("Oops, the result is negative");
				}
			}
		}else if(option==5) {
			System.out.println("Enter first number");
			double num1= sc.nextDouble();
			System.out.println("Enter second number");
			double num2= sc.nextDouble();
			System.out.println("Enter third number");
			double num3= sc.nextDouble();
			System.out.println("Enter fourth number");
			double num4= sc.nextDouble();
			
			double sum= (num1+num2+num3+num4);
			double result=sum/4;
			if(result >0 || result==0) {
				System.out.println("The result is "+result);
			}else {
				System.out.println("Oops, the result is negative");
			}
			
		}else {
			System.out.println("invalid option");
		}
		sc.close();
		
	}

}
