package Assignment04;

public class RemovDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABCDACEFG";
		String s2="";
		
		//Converting to char array
		
		char [] ch1=new char [s1.length()];
		for (int i=0;i<s1.length();i++) {
			
			ch1[i]=s1.charAt(i);
		}
		//System.out.println(ch1);
		for (int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]);
	}
		System.out.println();
		//Sorting
		for (int i=0;i<ch1.length;i++) {
			for (int j=1;j<ch1.length-i;j++) {
				if (ch1[j]<ch1[j-1]) {
					char temp=ch1[j];
					ch1[j]=ch1[j-1];
					ch1[j-1]=temp;
				}
			}
		}
		//System.out.println(ch1);
		for (int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]);
				}
		System.out.println();
		
		//Removing Duplicates

		int j=0;
		for (int i=0;i<ch1.length-1;i++) {
			if(ch1[i]!=ch1[i+1]) {
				ch1[j]=ch1[i];
				j++;
			}
		}
		ch1[j++]=ch1[ch1.length-1];
		//System.out.println(ch1);
		for (int i=0;i<j;i++) {
			System.out.print(ch1[i]);
	}
	}}
