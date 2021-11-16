import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
int n=scn.nextInt();
int space=n/2;
int result;
for(int i=1;i<=n;i++)
{
int star=n-(2*space);
for(int j=1;j<=space;j++)
{
    System.out.print("\t");
}
result=i;
if(((n+1)/2)<i)
{
    result=i-((n+1)/2);
    result=((n+1)/2)-result;
}
for(int j=1;j<=star;j++)
{
 System.out.print(result +"\t");
 if((space+j)<=(n/2))
 {
     result++;
 }
 else
 {
     result=(j+space)-(n/2);
     result=(n/2)+1-result;
 }
}

if(i<=n/2)
{
    space--;
}
else
{
    space++;
}
System.out.println();
}
}
}
