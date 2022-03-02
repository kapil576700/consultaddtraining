package task4;

//import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		int a[][]= {{4,5,7},{8,4,6},{8,9,1}};
		int b[][]= {{5,5,8},{2,3,7},{6,1,0}};
		int c[][]= new int[3][3];
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {

				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(int i=0; i<a.length;i++) {
			System.out.print("|");
			for(int j=0; j<a[i].length; j++) {

				System.out.print(" "+c[i][j]+" ");
			}
			System.out.println("|");
		}
		
	}

}
