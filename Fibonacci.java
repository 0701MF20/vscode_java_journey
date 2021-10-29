//Simplified version
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int f0=0,f1=1;
   
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(f0);;
            int f2=f0+f1;
            f0=f1;
            f1=f2;
        }
        scn.close();
    }
}
