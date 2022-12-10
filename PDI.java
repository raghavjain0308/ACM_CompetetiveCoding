package recurssion;

import java.util.Scanner;

public class PDI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		PDI(n);
	}
	
	public static void PDI(int n) {
		if(n<1) {
			return;
		}
		
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}

}
