package assignment1;

import java.util.Scanner;

public class replacing0With5 {
	public static int reverseNew_Num1(int new_num1) {
		int ans=0;
		while(new_num1>0) {
			int digit=new_num1%10;
			
			ans=ans*10+digit;
			
			new_num1=new_num1/10;
		}
		
		return ans;
	}
	
	public static int convert0to5(int num) {
		int new_num1=0;
		   if(num==0) {
			   return 5;
		   }
		   else {
			   while(num>0) {
				   int digit=num%10;
				   if(digit==0) 
					   digit=5;
				   
			      new_num1= new_num1*10+digit;
			      
				  num=num/10;
			   }
		   }
             return reverseNew_Num1(new_num1);
		 
	}
           public static void main(String[] args) {
        	   Scanner sc = new Scanner (System.in);
        	   int num= sc.nextInt();
        	   
        	   convert0to5(num);
			
		}

}
