package functions;

import java.util.Scanner;

public class Circumference {
	public static int  calculateCircumference (int r) {
		int  circumference = (2*22*r)/7;
		return circumference;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
	System.out.println(calculateCircumference(r));	
	}

}
