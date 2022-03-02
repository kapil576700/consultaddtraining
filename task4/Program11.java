package task4;

import java.util.Arrays;
import java.util.Stack;

public class Program11 {

	public static void main(String[] args) {

		int arr[] = {10,40,15,35,22,18,20,14,59,19};
		Arrays.sort(arr);
		
		int pointer = arr.length/2;
		Stack maxStk = new Stack();
		Stack minStk = new Stack();
		
		for(int i=pointer; i<arr.length;i++) {
			maxStk.add(arr[i]);
		}
		for(int i=pointer-1; i>=0;i--) {
			minStk.add(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				arr[i]=(Integer)maxStk.pop();
			}else if(i%2 !=0) {
				arr[i]=(Integer)minStk.pop();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]+" ");
		}
	}

}
