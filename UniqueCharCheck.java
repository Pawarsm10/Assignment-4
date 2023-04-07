package Assignment04;

public class UniqueCharCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="SURAJPAWAR";
		int count=0;
		char[] ch1=s1.toCharArray();
		
		for (int i=0;i<ch1.length;i++) {
			for (int j=i+1;j<ch1.length;j++) {
				if(ch1[i]==ch1[j]) {
					count++;
					System.out.print(ch1[i]+" ");
					
				}
			}
		}
		// System.out.println(count);
		if(count==0) {
			System.out.println("String has all unique characters");

		}
		if (count>0) {
			System.out.println();
			System.out.println("String has above duplicate characters");

		}

	}

}
