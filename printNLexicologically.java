package recurssion;

public class printNLexicologically {
	public static void main(String[] args) {
		
			PL(0, 1000);
		
	}
	public static void PL(int curr_num, int final_num) {
		
		
		if(curr_num  > final_num) {
			return  ;
		}
		System.out.println(curr_num);// printing curr_num if its not a -ve base case-965
		int i=0;
		if(curr_num==0) { // if we call 0 then it goes into infinite rec as 0 will call 0 again and again
			i=1;
		}
		for( ; i<=9; i++) {
			
			PL(curr_num*10+i , final_num);
		}
	}

}
