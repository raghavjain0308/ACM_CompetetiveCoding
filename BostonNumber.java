package assignment1;

import java.util.Scanner;

public class BostonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=2; i<N; i++) {
			if(N%i==0) {
				for(int j=1; j<=i; j++) {
					int count=0;
					int factor=i%j;
					if(factor==0) {
						count++;
						if(count==2) {
							sum2=sum2+j;
							System.out.println(j);
						}
					}
				}
			}
		}
		while(N>0) {
			int digit= N%10;
			 sum2= sum2+digit;
			N=N/10;
			
		}
		if(sum1==sum2) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}
