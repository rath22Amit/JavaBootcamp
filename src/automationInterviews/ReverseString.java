package automationInterviews;

public class ReverseString {

	public static void main(String[] args) {
		
		//First Method
		String str= "LOLZ";
		String rev="";
		for(int i=str.length()-1;i>=0;i-- ) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println("The value of input string is: "+str);
		System.out.println("The value of reversed string is: "+rev);
		
		//Second Method
		
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//This can be done using Stringbuilder as well
		
		StringBuilder sbb= new StringBuilder(str);
		System.out.println(sbb.reverse());
	}

}
