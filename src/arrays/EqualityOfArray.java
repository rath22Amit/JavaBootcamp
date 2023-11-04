package arrays;

public class EqualityOfArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6};
		int b[]= {2,3,4,5};
		
		if(a.length==b.length) {
			int i=a.length-1;
			
			while(i!=-1) {
				if(a[i]==b[i]) {
					System.out.println("Index "+i +" value matches");
					i--;
					continue;
				}
				else {
					System.out.println("The array are not equal");
					i--;
					break;
				}
				
				
			}
			
			
		}
		
		else {
			System.out.println("The arrays are not equal");
		}

	}

}
