// 0   1   1   2   3   5   8   13
//     +   +   +   +   +   +   
import java.util.Scanner;
class FibonacciSeries3
{
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter end:");
long end = sc.nextLong();
long a=0;
long b=1;
System.out.println(a+" " +b);
long c;
for (int i =1; i<=end; i++)
{
c=a+b;
System.out.println(" " +c);
a=b;
b=c;
}

}
}