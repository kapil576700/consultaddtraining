package task5;

import java.util.Scanner;

public class Program4a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		String[] arr = str.split(" ");
		String newStr="";
		String[] reverse = new String[arr.length];
		for(int i=0; i<arr.length;i++) {
			newStr="";
			for(int j=arr[i].length()-1;j>=0;j--) {
				newStr = newStr+ arr[i].charAt(j);
			}
			reverse[i]=newStr;
		
		}
		for(int i=0; i<reverse.length;i++) {
			System.out.print(" "+reverse[i]+" ");

		}
		sc.close();
	}

}
