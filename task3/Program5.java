package task3;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the long datatype number: ");
		long num = sc.nextLong();
		String str = String.valueOf(num);
		System.out.println("number of digits present in the number are "+str.length());
		int sum= 0;
		for(int i=0; i<str.length(); i++) {
			sum= sum+ str.charAt(i) - '0';
		}
		System.out.println("The sum of digits is "+sum);
		sc.close();
	}

}
