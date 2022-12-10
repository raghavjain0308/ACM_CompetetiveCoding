package assignment1;

import java.util.Scanner;

public class isPalin {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x= sc.nextInt();
		int temp=x;
		int ans=0;
		while(x>0) {
			int ld=x%10;
			ans=ans*10+ld;
			x=x/10;
					
		}
		if(ans==temp) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
