package task2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		String str1= "Consultadd";
		String str2= "JAVA Training";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num%5 == 0 && num%3 ==0) {
			System.out.println(str1+" "+str2);
		}else if(num%5 == 0) {
			System.out.println(str2);
		}else if(num%3 == 0) {
			System.out.println(str1);
		}else {
			System.out.println("Not divisible by both 3 and 5");
		}
		sc.close();
	}

}
