package task4;
//This program can take sorted and unsorted array as input
import java.util.Arrays;
import java.util.Scanner;

public class Program6 {
	private static void removeDuplicate(int[] arr, int length) {

		int[] temp = new int[length];
		int j=0;
		for(int i=0; i<length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[length-1];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=temp[i];
		}
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the numbers in the array: ");
		for(int i=0; i<length;i++) {
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);
		
		removeDuplicate(arr, length);
		
		for(int i=0; i<length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
