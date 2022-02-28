package task3;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you wish to see the multiplication table: ");
		int num= sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+"X"+i+"="+num*i);
		}
		sc.close();
	}

}
