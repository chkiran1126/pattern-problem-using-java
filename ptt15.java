package patterns;
import java.util.*;
public class ptt15 {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    //Outer loop
    for(int i=0;i<n;i++){
      for (int j=0;j<(n-i);j++){
        System.out.print(" ");//print Space
      }
      char ch='A';
      int breakpoint=(2*i+1)/2;
      for(int j=1;j<=(2*i+1);j++){//print character
        System.out.print(ch);
        if (j<=breakpoint) ch++;
        else ch--;
      }
      System.out.println();
    }
    sc.close();
  }
}

