//Improved Approach and simplified approach
import java.util.*;
public class HCDandLCM {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
int n1=scn.nextInt();
int n2=scn.nextInt();
int on1=n1;
int on2=n2;
while(n2%n1!=0)
{
int remainder=n2%n1;
n2=n1;
n1=remainder;
}
int gcd=n1;
System.out.println(gcd);
int lcm=(on1*on2)/gcd;
System.out.println(lcm);
scn.close();
    }
}
