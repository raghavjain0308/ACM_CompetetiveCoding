package assignment1;

import java.util.Scanner;

public class FarhenheittoCelcius {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int minf= sc.nextInt();
		int maxf= sc.nextInt();
		int step= sc.nextInt();
		
		while(maxf>=minf) {
			int f= minf-32;
			int celcius= (5*f)/9;
			System.out.println( minf+"    "+"\t"+celcius);
			minf=minf+step;
		}
	}

}
