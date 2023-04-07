package Assignment04;

import java.util.Arrays;

public class MaxCharInString {

	public static void main(String[] args) {

		String s1="KITS COLLEGE OF ENGINEERING KOLHAPUR";
		
		s1=s1.replace(" ","");
		//System.out.println(s1);
		int []arr=new int[256];

		int max=-1;
		char result=0;

		for(int i=0;i<s1.length();i++) {
				
					arr[s1.charAt(i)]++;
				}
		
		for (int i=0;i<s1.length();i++) {
			if (max<arr[s1.charAt(i)]) {
				max=arr[s1.charAt(i)];
				result=s1.charAt(i);
			}
		}
		System.out.println("Maximum Repeated element: "+result);
		System.out.println(max+" times");
	}
	}


