package Assignment04;


public class CountingSpecialCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="$SURAJ@PAWAR$";
		int count=0;
		int count1=0;
		int count2=0;
		for(int i=0;i<s1.length();i++) {
			if ((s1.charAt(i)=='A')||(s1.charAt(i)=='E')||(s1.charAt(i)=='I')
					||(s1.charAt(i)=='O')||(s1.charAt(i)=='U')){
				
				count++;
			}
		}
		System.out.println("Number of Owels in String are: "+count);
		
		for(int i=0;i<s1.length();i++) {
			if ((s1.charAt(i)!='A')&&(s1.charAt(i)!='E')&&(s1.charAt(i)!='I')
					&&(s1.charAt(i)!='O')&&(s1.charAt(i)!='U')){
				
				count1++;
			}
		}
		System.out.println("Number of Consonents in String are: "+count1);
		
		for(int i=0;i<s1.length();i++) {
			if ((s1.charAt(i)<65)||(s1.charAt(i)>122)){
				
				count2++;
			}
		}
		System.out.println("Number of Special Characters in String are: "+count2);

	}

}
