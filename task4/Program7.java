package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int length= sc.nextInt();
		int arr[]= new int[length];
		int difference;
		if(length<=1) {
			System.out.println("Length of the array should be greater than 1");
		}else {
			System.out.println("Enter the elements of the array");
			for(int i=0; i<length; i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			difference= arr[arr.length-1]-arr[0];
			System.out.println("The difference between the largest and smallest element is : "+difference);
		}
		sc.close();
		
	}

}
