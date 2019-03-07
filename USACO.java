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
    int[][] lake = new int[R][C];
    for(int i = 0; i < R; i++){
      for(int j = 0; j < C; j++){
        lake[i][j] = Integer.parseInt(sc.next());
      }
    }
    return lake[0][0];
  }
  public static void stomp(int row,int col,int dig, int[][] layk){
    int max = 0
    
  }
   public static void main(String[] args){
     try{
     System.out.println(bronze("makelake.in"));
   }catch(FileNotFoundException e){
         System.out.println("File not found: ");
   }

   }
}
