package patterns;

import java.util.*;
public class ptt18 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n =5;
    // OUTER LOOP
    for(int i=1;i<=n;i++){
      // INNER LOOP 
      for(int j =1;j<=i;j++){
        System.out.print("*");
      }
      // SPACES
      int space=2*(n-i);
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      // STARS
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    //LOWER PART OF PATTERN
    for(int i=n-1;i>=1;i--){
      // INNER LOOP 
      for(int j =1;j<=i;j++){
        System.out.print("*");
      }
      // SPACES
      int space=2*(n-i);
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      // STARS
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();

  }
}
