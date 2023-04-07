package Assignment04;

public class PrintingDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "UVWXYZXUV";
		
		System.out.println("Given String :"+s1);
		char [] ch1=s1.toCharArray();
		
		System.out.print("Duplicates are :");
		for (int i=0;i<ch1.length;i++) {
			for (int j=i+1;j<ch1.length;j++) {
				if(ch1[i]==ch1[j]) {
					System.out.print(s1.charAt(i));
				}
			}
		}

	}

}
