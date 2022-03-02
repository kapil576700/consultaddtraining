package task3;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		String[] str = String.valueOf(num).split("");
		int sum=0;
		System.out.print("The numbers entered are: ");
		for(int i=0; i<str.length;i++) {
			System.out.print(str[i]+" ");
			sum= sum+ Integer.parseInt(str[i]);
		}
		System.out.println();
		System.out.println("Sum = "+sum);
		sc.close();
	}

}
