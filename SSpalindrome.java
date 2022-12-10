package strings;

public class SSpalindrome {
	public static void isPalindrome(String str) {
		
	}
	public static void main(String[] args) {
		String str="nitin";
		for(int i=0; i<=str.length()-1;i++) {
			for(int j=i+1; j<=str.length(); j++) {
				System.out.println(str.substring(i,j));
				
			}
		}
	}

}
