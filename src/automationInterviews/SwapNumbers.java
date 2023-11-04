package automationInterviews;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the second Number: ");
		int b= sc.nextInt();
		
		System.out.println("The input values are \n a: "+a +" and b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping \n a: "+a +" and b: "+b);
	}

}
