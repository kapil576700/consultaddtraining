package task3;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of lines: ");
		int line= sc.nextInt();
		int space = line;
		int num=1;
		
		for(int i=0; i<line;i++) {
			for(int s=1; s<space;s++) {
				System.out.print(" ");
			}
			num=1;
			for(int j=0; j<=i;j++) {
				System.out.print(num+" ");
				num=num*(i-j)/(j+1);
			}
			space--;
			System.out.println();
		}
		sc.close();
		
	}

}
