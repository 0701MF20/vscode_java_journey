//MyAPPROACH IN THIS FIRST WE HAVE TO FIND THE THE SMALLEST NOS THEN FIND THE SMALLEST ONE
//Brute force is applied
import java.util.*;
public class HCDandLCM {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
int n1=scn.nextInt();
int n2=scn.nextInt();
int min=n1;
//HCFor GCD algo
//So we cracked the algorithm from HCF definition itself which states theat find highest common factor so instead of starting from 0 or 2 
//we have to start from minimum element then apply modulus to both n1 and n2 and find the common point
//where both n1 and n2 modulo value is 0 and thus satisfy the condition
if(n2<min)
{
    min=n2;
}
int GCD=1;
System.out.println(min);
int i=min;
while(i>=1)
{
    if((n1%i==0)&&(n2%i==0))
    {
        GCD=GCD*i;
        break;
    }
    i--;
}
System.out.println(GCD);
//LCM
//Lcm commmon multiple is nothinng but a number to which n1 and n2 is a factor and we have to find the least number 
//least multiple atleast so first find gcd and then multiply the n1 with gcd and keep tis value in result 1 and then divide n2 wuth gcd and keep tehe result as well the 
//multiply both the result as well as as gcd .
int temp1=n1/GCD;
int temp2=n2/GCD;
int LCM=temp1*temp2*GCD;
System.out.println(LCM);
scn.close();
    }
}
