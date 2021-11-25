import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
   int n=scn.nextInt();
   int k;
   for(int i=1;i<=n;i++)
   {
     int space=((2*n)-1)-(2*i);
     int count=i;
     for(int j=1;j<=i;j++)
     {
         System.out.print(count+"\t");
     count++;
     }
     for(int j=1;j<=space;j++)
     {
         System.out.print("\t");
     }
     if(i==(n-1))
     {
         k=i-1;
         count=count-2;
     }
     else
     {
         k=i;
         count=count--;
     }
     for(int j=1;j<=k;j++)
     {
         System.out.print(count+"\t");
         count--;
     }
     System.out.println();
   }

 }
}
