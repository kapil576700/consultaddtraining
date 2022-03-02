package task5;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		String temp;
		for(int i=0; i<arr.length;i++) {
			for(int j =i+1;j<arr.length; j++) {
				if(arr[i].length()>arr[j].length()) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println(arr[0]);
	}

}
