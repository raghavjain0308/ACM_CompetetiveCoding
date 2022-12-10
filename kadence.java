package test1;

import java.util.Scanner;

public class kadence {
	public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int T = sc.nextInt();
            int count=0;
            while(count<T) {
            	int size= sc.nextInt();
            	int arr[]= new int [size];
            	for(int i=0; i<size; i++) {
            		arr[i]=sc.nextInt();
            	}
            	System.out.println(kadanes(arr));
            	
            	count++;
            }
            	
            
	}
	public static int kadanes(int arr[]) {
		int max_sum=0;
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			
			if(sum>max_sum) {
				max_sum=sum;
			}
			if(sum<0) {
				max_sum=0;
			}
		}
		return max_sum;
	}

}
