package task5;

import java.util.Arrays;
import java.util.Scanner;

//not sure if duplicates are allowed
public class Program2 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=0;
		for(int i=1; i<arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println("The sum of elements except highest and lowest values is : "+sum);
		
	}

}
