package assignment1;

import java.util.Scanner;

public class HollowDiamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space_count = 1;

		for (int i = 1; i <= n; i++) {
			if (i == 1 || i == n) {
				for (int j = 1; j <= n; j++) {
					System.out.print("*");
				}
			}
			if (i <= (n + 1) / 2) {
				for (int j = 1; j <= n - i - 1; j++) {
					System.out.print("*");
				}

				for (int j = 1; j <= space_count; j++) {
					System.out.print("\t");
				}
				space_count = space_count + 2;
				for (int j = 1; j <= n - i - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			if (i > (n + 1) / 2) {
				for (int j = 1; j <= n - i + 1; j++) {
					System.out.print("*");
				}
				space_count = space_count - 2;
				for (int j = 1; j <= space_count; j++) {
					System.out.print("\t");
				}
				for (int j = 1; j <= n - i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();

			}

		}

	}

}
