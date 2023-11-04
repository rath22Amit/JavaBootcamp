package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindOddAndEven {

	public static void main(String[] args) {
		
		int arr[]= {1,4,5,6,23,2,5,3};
		
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
			}
			else {
				odd.add(arr[i]);
			}
		}
		
		System.out.println("Even "+even);
		System.out.println("Odd "+odd);

	}

}
