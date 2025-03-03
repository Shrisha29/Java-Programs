import java.util.Scanner;
class PrimeNumberRange
{
Scanner sc = new Scanner(Sytsem.in);
System.out.println("Enter the starting num:");
int start = sc.nextInt();
System.out.println("Enter the range end num:");
int rangeend = sc.nextInt();
int temp = 0;
int cnt=0;

for(int i = start; i<=end; i++)
{
if(i==1)continue;    //skip 1 because not prime
temp = 0;
for(int j=2; j*j<=i; j++)
{
if(i%j==0)
{
temp=1;
break;
}
}
if(temp==0)
{
System.out.println(i+" " +);
cnt++;
}
else
temp = 0;
}
System.out.printl("Count is:"+cnt);
}
}
