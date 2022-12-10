package functions;

import java.util.Scanner;

public class votingEligibility {
	public static void eligibility(int age) {
		if(age>18) {
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("NOT Eligible to vote");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age= sc.nextInt();
		eligibility(age);
	}

}
