import java.util.*;
import java.io.*;
public class USACO{
  /*private int R;
  private int C;
  private int E;
  private int N;
  private char[][] lake;*/
  public static int bronze(String filename) throws FileNotFoundException{
    File f = new File(filename);
    Scanner sc =  new Scanner(f);
    int R =0;
    int C =0;
    int E = 0;
    int N = 0;
    R = Integer.parseInt(sc.next());
    C = Integer.parseInt(sc.next());
    E = Integer.parseInt(sc.next());
    N = Integer.parseInt(sc.next());
    int[][] lake = new int[R][C]; //makes lake
    for(int i = 0; i < R; i++){
      for(int j = 0; j < C; j++){
        lake[i][j] = Integer.parseInt(sc.next());
      }
    }
    while(sc.hasNext()){  //keep running stomp
      int r = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());
      stomp(r,c,d,lake);
    }
    int sum = 0;
    for (int i = 0; i<R; i++){
      for (int j = 0; j<C; j++){
        if(N<lake[i][j])
        }
      }
    
    
  }
  
  public static void stomp(int row,int col,int dig, int[][] layk){
    int max = 0;
    //finds largest value in lake stomping range
    for (int i = row-1; i<row+2; i++){
      for (int j = col; j<col+2; j++){
        if (layk[i][j] > max){      
          max = layk[i][j];
        }
      }
    }
    max-= dig; //subtracts from largest number in range
    for (int i = row-1; i<row+2; row++){
      for (int j = col; j<col+2; j++){
        if (layk[i][j]> max){
          layk[i][j]-= dig;  //subtract numbers from dig only if they are greater than max
        }
      }
    }
  }
   public static void main(String[] args){
     try{
     System.out.println(bronze("makelake.in"));
   }catch(FileNotFoundException e){
         System.out.println("File not found: ");
   }

   }
}
