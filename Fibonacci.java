import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int f0=0,f1=1;
   
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
          System.out.println(f0);
        System.out.println(f1);
        for(int i=2;i<n;i++)
        {
          int f2=f1;
            f1=f0+f1;
              System.out.println(f1);
            f0=f2;
        }
        scn.close();
    }
}
