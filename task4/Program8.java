package task4;

import java.util.Arrays;
import java.util.Scanner;

public class Program8 {
	private static int removeDuplicate(int[] arr, int length) {

		if (length == 0 || length == 1) {
			return length;
		}
		int[] temp = new int[length];
		int j = 0;
		for (int i = 0; i < length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[length - 1];

		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}

		return j;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the numbers in the array: ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);

		length = removeDuplicate(arr, length);

		System.out.println("The new length of the array is : "+ length);
		sc.close();
	}
}
