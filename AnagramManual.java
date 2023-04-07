package Assignment04;

public class AnagramManual {
	 

	public static void main(String[] args) {
		
		String s1="Race";
	    String s2="Care";
	   
	    
	    System.out.println("Given String");
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println();
	    
	    //Converting to Array
	    char [] ch1= s1.toCharArray();
	    char [] ch2= s2.toCharArray();
	    
	    System.out.println("Case matching");
	    //lowering case
	     for (int i=0;i<s1.length();i++) 
	    	{
	    		if(ch1[i]<97){
	    			ch1[i]=((char)(ch1[i]+32));
	    		}
	    	}
	     System.out.println(ch1);
	     
	     for (int i=0;i<s2.length();i++) 
	 	    	{
	 	    		if(ch2[i]<97){
	 	    			ch2[i]=((char)(ch2[i]+32));
	 	    		}
	 	    	}
	 	  System.out.println(ch2);
	 	  System.out.println();
	 	  
	 	  System.out.println("Sorted String");
	 	  
	 	  //sorting
	 	  for (int i=0;i<ch1.length;i++) {
	 		  for (int j=i+1;j<ch1.length;j++) {
	 			  if(ch1[i]>ch1[j]) {
	 				  char temp=ch1[i];
	 				  ch1[i]=ch1[j];
	 				  ch1[j]=temp;
	 			  }
	 			 }
	 		  }
	 	 System.out.println(ch1);
	 	 
	 	 for (int i=0;i<ch2.length;i++) {
	 		  for (int j=i+1;j<ch2.length;j++) {
	 			  if(ch2[i]>ch2[j]) {
	 				  char temp=ch2[i];
	 				  ch2[i]=ch2[j];
	 				  ch2[j]=temp;
	 			  }
	 			 }
	 		  }
	 	System.out.println(ch2);
	 	System.out.println();
	 	
	 	System.out.println("Comparison");
	 	
	 	//comparing
	 	
	 	boolean flag=false;
	 	
	 	if (ch1.length>=ch2.length) {
	 	int [] ar1=new int [(ch1.length)];
	 	
	 	for (int i=0; i<ch1.length; i++) {
	 		for (int j=0; j<ch2.length; j++)
	 		{
		 		if (ch1[i]==ch2[j])
		 		    {
		 			ar1[i]++;
		 			}
		 	}
	 	}
	 	for (int i=0;i<ar1.length;i++) {
	 	if (ar1[i]==0) {
	 		System.out.println("String is not Anagram!");
	 		flag=true;
	 	}
	 	}
	 	if (flag==false) {
	 		System.out.println("String is Anagram!");
	 	}
	 	}
	 	
	 	
	 	if (ch1.length<ch2.length)
	 	 {
		 	int [] ar2=new int [(ch2.length)];
	 
	 	for (int i=0; i<ch2.length; i++) {
	 		for (int j=0; j<ch1.length; j++)
	 		{
		 		if (ch2[i]==ch1[j])
		 		{	
		 			ar2[i]++;
		        }
		 	}
	 	}
	 	for (int i=0;i<ar2.length;i++) {
		 	if (ar2[i]==0) {
		 		System.out.println("String is not Anagram!");
		 		flag=true;
		 	}
		 	}
		 	if (flag==false) {
		 		System.out.println("String is Anagram!");
		 	}
	 	}
	 	
	 }
}
	
	
	    

	

