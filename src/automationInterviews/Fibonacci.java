package automationInterviews;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int first_num=0;
		int second_num=1;
		int new_num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Fibo you want :");
		int fibo_count=sc.nextInt();
		
		System.out.print(""+first_num+","+second_num);
		for(int i=0;i<fibo_count-2;i++) {
			new_num=first_num+second_num;
			first_num=second_num;
			second_num=new_num;
			
			System.out.print(","+new_num);
		}

	}

}
