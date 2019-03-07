import java.util.*;
import java.io.*;
public class USACO{
  /*private int R;
  private int C;
  private int E;
  private int N;
  private char[][] lake;*/
  //VOID FOR NOW
  public static void bronze(String filename) throws FileNotFoundException{
    File f = new File(filename);
    Scanner sc =  new Scanner(f);
    int R =0;
    int C =0;
    R = sc.nextInt();
    C = sc.nextInt();
    int[][] lake = new int[R][C];
    for(int i = 0; i < R; i++){
      for(int j = 0; j < C; j++){
        lake[i][j] = sc.nextInt();
      }
    }
  }
}
