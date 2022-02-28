package task2;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num= sc.nextInt();
		
		if(num%2 != 0) {
			System.out.println("NEW");
		}else if(num%2 == 0 && num>=2 && num<=5) {
			System.out.println("OLD");
		}else if(num%2 == 0 && num>=6 && num<=30) {
			System.out.println("NEW");
		}else if(num%2 == 0 && num>30) {
			System.out.println("OLD");
		}
		sc.close();
	}

}
