import java.util.Scanner;
class EmirpNumber
{
public static void main(String []args)
{
System.out.print("Enter the number:");
int num = new Scanner (System.in).nextInt();
int dup = num;
int rev=0;
while(num>0)
{
int rem = num%10;
rev=(rev*10)+rem;
num /=10;
}
System.out.println("Reverse number is :"+rev);
num = dup;
boolean flag= true;
for (int i=2; i<num; i++)
{
if(num %i ==0)
{
flag = false;
break;
}
}
if(flag && num>1)
{
System.out.println(num + " is prime number");
}
else
{
System.out.println(num +" is not prime number");
}
boolean flagg = true;
for(int i=2; i<rev; i++)
{
if(rev%i==0)
{
flagg = false;
break;
}
}
if(flagg && rev>1)
{
System.out.println(rev+ " is prime number");
}
else
{
System.out.println(rev + " is not prime number");
}
if(flagg && flagg && num!=rev)
{
System.out.println(num + " is a Emirp number");
}
else
{
System.out.println(num + " is not Emirp number");
}
} 
}

