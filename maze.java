package recurssion;

public class maze {
	public static void main(String[] args) {
		mazeRunner(0,0,2,2,"");
	}
public static void mazeRunner(int r, int c, int final_r,int final_c ,String path) {
  if(r>final_r|| c>final_c) {
	return;
  }
  
  if(r==final_r && c==final_c) {
	  System.out.println(path);
	  return;
  }
	mazeRunner( r+1,  c,  final_r,final_c,   path+"D");
mazeRunner( r,  c+1,  final_r,final_c,   path+"R");
}
}
      