import java.util.Scanner;
class PasswordProgram
{
public static void main(String[]args) throws InterruptedException
{
Scanner sc =new Scanner(System.in);
int storePin = 143;
int seconds = 5000;

outerLoop:
for( ; ; )
{
int attempts = 3;
do
{
System.out.println("enter your pin:");
int pin = sc.nextInt();
if(storePin==pin)
{
System.out.println("PHONE UNLOCKED ");
break outerLoop;
}
else
{
System.out.println("WRONG PIN"); 
System.out.println("ATTEMPT LEFT"+(attempts-1));
}
attempts--;
}
while(attempts>=1);
System.out.println();
System.out.println("PHONE DISABLED FOR "+(seconds/1000)+" seconds");
Thread.sleep(seconds);
seconds *=2;
System.out.println();
}
}
}