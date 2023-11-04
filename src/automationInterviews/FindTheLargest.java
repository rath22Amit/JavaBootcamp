package automationInterviews;

public class FindTheLargest {

	public static void main(String[] args) {
		int a,b,c;
		a=30;
		b=20;
		c=30;
		
		int largest=a;
		
		if(b>a && b> c) {
			largest=b;
			System.out.println("b is largest among all with value "+b);
		}
		
		else if( c>a && c>b) {
			largest=c;
			System.out.println("c is largest among all with value "+c);
		}
		
		else {
			System.out.println("a is largest among all with value "+a);
		}
		
		

	}

}
