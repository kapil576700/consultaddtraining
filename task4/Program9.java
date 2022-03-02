package task4;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target: ");
		int target = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j]==target-arr[i]) {
					System.out.println("Target is the sum of: "+arr[i]+" and "+arr[j]);
					break;
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
