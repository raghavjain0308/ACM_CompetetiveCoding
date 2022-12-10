package recurssion;

public class tossNcoinsWithout2H {
	public static void main(String[] args) {
		TC(3,"",false);
	}
	public static void TC(int n, String str, boolean isHeads) {
		if(n==0) {
			System.out.println(str);
			return;
		}
		
		if(isHeads==false) {
			TC( n-1,  str+"H",  true);
		}
		
		TC(n-1,  str+"T",  isHeads);
	}

}
