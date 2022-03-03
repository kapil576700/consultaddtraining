package ChatBot;

import java.util.Scanner;

public class ChatbotClass {

	public static void main(String[] args) {
		System.out.println("Hello! My name is Axion.");
		System.out.println("I was created in the year 2022.");
		Scanner sc = new Scanner(System.in);
		System.out.println("May I please know your name?");
		String name = sc.next();
		System.out.println("Hey "+name+"! it's nice meeting you, that's a great name your have.");
		System.out.println("");
		System.out.println("May I reverse spell your name?");
		String agree= sc.next();
		if(agree.equalsIgnoreCase("yes")) {
			String reverseName="";
			for(int i=name.length()-1; i>=0;i--) {
				reverseName= reverseName+name.charAt(i);
			}
			System.out.println("Your name spelled reverse is "+reverseName);
		}else {
			System.out.println("Hmmm...OK");
		}
		System.out.println("");
		System.out.println("Let me guess your age?");
		System.out.println("Please divide your age with 3, 5 and 7 and enter their remainders below");
		System.out.print("Remainder for age divided by 3 : ");
		int reamainder3 = sc.nextInt();
		System.out.print("Remainder for age divided by 5 : ");
		int remainder5 = sc.nextInt();
		System.out.print("Remainder for age divided by 7 : ");
		int remainder7 = sc.nextInt();
		
		int age = ((reamainder3 *70 + remainder5 * 21 + remainder7 * 15) %105);
		System.out.println("Your age is "+age+" that is a good time to start programming");
		System.out.println("");
		System.out.println("Now I can prove that I can count to any number that you want me to count till.");
		System.out.println("Please Enter the number that you want me to count till : ");
		int count = sc.nextInt();
		for(int i =0; i<=count; i++) {
			System.out.println(i+"!");
		}
		System.out.println("");
		System.out.println("Done...");
		System.out.println("");
		System.out.println("Now Let's have a quiz.");
		System.out.println("");
		System.out.println("Why do we use methods?");
		System.out.println("1. To repeat a statement multiple times.");
		System.out.println("2. To decompose a program into several small routines.");
		System.out.println("3. To determine the execution routine.");
		System.out.println("4. To interrupt the execution of the program");
		int answer1 = sc.nextInt();
		while(answer1!=2) {
			System.out.println("Please try again!");
			answer1 = sc.nextInt();
		}
		if(answer1==2) {
			System.out.println("Congratulations! that's the right answer.");
		}
		System.out.println("");
		
		System.out.println("Now Let's have another quiz.");
		System.out.println("");
		System.out.println("What is the advantage of inheritence?");
		System.out.println("1. To repeat a statement multiple times.");
		System.out.println("2. To decompose a program into several small routines.");
		System.out.println("3. To create new classes based on the existing ones");
		System.out.println("4. To interrupt the execution of the program");
		int answer2 = sc.nextInt();
		while(answer2!=3) {
			System.out.println("Please try again!");
			answer2 = sc.nextInt();
		}
		if(answer2==3) {
			System.out.println("Congratulations! that's the right answer.");
		}
		System.out.println("");
		System.out.println("Now let me show you a pattern of stars.");
		System.out.print("Enter the number of rows in the pattern : ");
		int rows = sc.nextInt();
		for(int i=0; i<rows; i++)   
		{   
		for(int j=0; j<=i; j++)   
		{   
		System.out.print("* ");   
		}   
		System.out.println();
		}
		System.out.println("There you go!");
		System.out.println("");
		System.out.println("Have a nice day! :) ");
		sc.close();
		
	}

}
