//optimized prime nos problem as the factor of prime number must be less ythan the square root of the given nos so hence we use this strategy only
//Reminder it is not optimized as it will divide with all the possible factor (but the question is do we really need to divide with each and every factor because if an number divide by 
//a single factor nos then this clearly show that number is not prime.So solution to this is discussed in next discussion
//OPTIMIZED SOLUTION

import java.util.*;
public class IsPrimeNos {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int j=0;j<t;j++)
        {
        int n=scn.nextInt();
        int count =0;
        for(int div=2;(div*div)<=n;div++)
        {
            if(n%div==0)
            {
            count++;
            break;
            }
        }
        if(count==0)
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

