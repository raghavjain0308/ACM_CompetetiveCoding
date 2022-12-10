package assignment1;

public class PatternMagic {
	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++) {
			if(i==1) {
				for(int j=1; j<=2*n-1; ) {
					System.out.print("*");
					break;
				}
			}int count=6;
			for(int j=1; j<=count-i; j++) {
				System.out.print("*");
				
			}
			for(int j=1; j<=2*(i-1)-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=count-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=2; i<=n; i++) {
			if(i==n) {
				for(int j=1; j<=2*n-1;) {
					System.out.print("*");
				    break;
				}
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}int count=n;
			for(int j=1; j<=count; j++) {
				System.out.print(" ");
			}
			count=count-2;
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
