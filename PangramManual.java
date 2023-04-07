package Assignment04;

public class PangramManual {
	 
	public static void main(String[] args) {
		
		String s1= "THE QUICK BROWN FOX JUMPES OVER THE LAZY DOG";
		String s2="";
		//Sorting String
		char [] ch1=s1.toCharArray();
		
	    for (int i=0;i<ch1.length;i++){
			if(ch1[i]!=' ') {
				s2=s2+ ch1[i];
			}
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		// char [] ch2=s2.toCharArray();
		// toCharArray
		char [] ch2=new char [s2.length()];
		for (int i=0;i<s2.length();i++) {
			
			ch2[i]=s2.charAt(i);
		}
		System.out.println(ch2);
		//Checking  Pangram
		int [] i1=new int [26];
		
		boolean flag=false;
		for (int i=0;i<ch2.length;i++) 
				    {
					int index=ch2[i]-65;
					i1[index]++;
					}
		for (int i=0;i<i1.length;i++) {
           if (i1[i]==0) {
        	   System.out.println("String is not Pangram!");
        	   flag=true;
           }
          
		}
		if (flag==false) {
     	   System.out.println("String is Pangram!");

		}
	}
}
	

/*char a1=' ';
int i1=a1 ;
 {
	System.out.println(i1);
 */