package task5;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the array: ");
		int length = sc.nextInt();
		System.out.println("Enter the numbers in the array");
		int arr[] = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int oddcount=0;
		int evencount=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencount=evencount+1;
			}else {
				oddcount=oddcount+1;
			}
		}
		int decisionNum = 0;
		if(oddcount==1) {
			decisionNum=2;
		}else if(evencount==1) {
			decisionNum=1;
		}else {
			throw new IllegalArgumentException("Not a valid input of array");
		}
		

		switch (decisionNum) {
		case 1:
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 == 0) {
					System.out.println(arr[i] + " is the even number found in odd number list");
				}
			}
			break;
		case 2:
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 != 0) {
					System.out.println(arr[i] + " is the odd number found in even number list");
				}
			}
			break;
		default:
			System.out.println("Invalid list");
			break;
		}
		sc.close();

	}

}
