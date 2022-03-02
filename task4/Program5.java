package task4;

import java.util.Arrays;
import java.util.Stack;

public class Program5 {

	public static void main(String[] args) {

		int a[]= {1,0,5,8,0,2};
		
		Stack stk = new Stack();
		
		for(int i=0; i<a.length;i++) {
			if(a[i]!=0) {
				stk.add(a[i]);
			}
		}
		Arrays.sort(a);
		for(int i=0; i<a.length;i++) {
			if(a[i]==0) {
				stk.add(a[i]);
			}
		}

		for(int i=a.length-1; i>=0; i--) {
			a[i]=(Integer)stk.pop();
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
