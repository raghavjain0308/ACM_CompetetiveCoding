package recurssion;

public class climbingStairs { 
	static int count=0;
    public static void main(String[] args) {
		
    	climbingStair(0,5,"");
		
		System.out.println("total possible ways: "+count);
		
	}
    public static void climbingStair(int curr_lvl, int final_lvl, String path) {
    	if(curr_lvl==final_lvl) {
    		System.out.println(path);
    		count++;
    		return ;
    	}
    	if(curr_lvl>final_lvl) {
    		return;
    	}
    	
    	climbingStair(curr_lvl+1,final_lvl,path+"1");
    	climbingStair(curr_lvl+2,final_lvl,path+"2");
    	climbingStair(curr_lvl+3,final_lvl,path+"3");
    		
    	
    }

}
