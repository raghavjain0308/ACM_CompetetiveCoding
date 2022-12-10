package assignment1;

import java.util.Scanner;

public class BinarytoDecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N=sc.nextInt();
		for(int i=1; i<=N; i++) {
			int n=sc.nextInt();
			double sum=0;
			double pos=0;
			while(n>0) {
				int digit=n%10;
				double mult=Math.pow(2,pos);
				if(digit==1) {
					sum=sum+mult;
				}
				n=n/10;
				pos++;
			}
			int ans=(int)sum;
			System.out.println(ans);
		}
	}

}
