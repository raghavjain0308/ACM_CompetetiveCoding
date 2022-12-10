package assignment1;

import java.util.Scanner;

public class Array_LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int m= sc.nextInt();
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==m) {
				System.out.println(i);
				break;
			}
			count++;
			
		}
		if(count==arr.length) {
			System.out.println("-1");
		}
		
	}
	
	
}
