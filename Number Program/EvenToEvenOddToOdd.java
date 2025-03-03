import java.utilo.Scanner;
class EvenToEvenOddToOdd
{
public static void main(String [] args)
{
System.out.println("Enter a number:");
int num = new Scanner(System.in).nextInt();
int dup = num;
int cnt = 0;
while(num>0)
{
cnt++;
num/=10;
}
String newNum = "";
if(cnt %2==0)    //if the len is even
{
for(int i dup; i>0; i/=10)
{
for(int i = dup; i>0; i/=10)
{
int rem = i%10;
if(rem % 2! = 0)
{
newNum = ++rem + newNum;
}
else
{
newNum = rem + newNum;
}
}
}
else //if the len is odd
{
for(int i = dup; i>0; i/=10)
{
int rem = i%10;
if(rem%2 == 0)
{
newNum = ++rem + newNum;
}
else
{
newNum = rem + newNum;
}
}
}
System.out.println(dup + ":" +newNum);
}
}