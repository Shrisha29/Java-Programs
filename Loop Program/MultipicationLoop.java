import java.util.Scanner;
class MultipicationLoop
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.pintln("Enter the no.:");
int num = sc.nextInt();
System.out.pintln("Enter the range:");
int range = sc.nextInt();

for(int i=1; i<=range; i++)
{
System.out.println(num+"x"+i+"="+(num*range));
}
}
}