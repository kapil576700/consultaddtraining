package task5;

import java.util.Scanner;

public class Program4 {

	public static boolean checkString(String[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {

					return false;
				} 
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		String temp = str.replaceAll("\\s", "");

		String[] arr = temp.split("");

		System.out.println(checkString(arr));
		sc.close();
	}

}
