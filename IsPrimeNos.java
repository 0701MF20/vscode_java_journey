//Not optimized prime nos problem
import java.util.*;
public class IsPrimeNos {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int j=0;j<t;j++)
        {
        int n=scn.nextInt();
        int count =0;
        for(int div=1;div<=n;div++)
        {
            if(n%div==0)
            {
            count++;
            }
        }
        if(count==2)
        {
         System.out.println("prime");
         }
        else{
         System.out.println("not prime");
         }
        }
       scn.close();
    }
}


