package automationInterviews;

import java.util.Scanner;

public class NoOfEvenAndOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer you want to check : ");
		int num= sc.nextInt();
		int count_even=0;
		int count_odd=0;
		int rem;
		
		while(num!=0) {
			rem=num%10;
			if(rem%2==0) {
				count_even++;
			}
			else if(rem%2!=0) {
				count_odd++;
			}
					
			num=num/10;
		}
		System.out.println("Even"+ count_even);
		System.out.println("Odd"+count_odd);
		
	}

}
