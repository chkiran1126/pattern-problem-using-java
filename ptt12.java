package patterns;
import java.util.*;
public class ptt12 {
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    for (int i =1;i<=n;i++){
      for(int j =0;j<i;j++){
        System.out.print((char)('A'+j));
      }
      System.out.println();
    }
    sc.close();
  }
}
