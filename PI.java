package recurssion;

import java.util.Scanner;

public class PI {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		
		PI(n);
		
	}
	public static void PI (int n) {
		if(n<1) {
			return;
		}
		PI(n-1);
		System.out.println(n);
	}

}
