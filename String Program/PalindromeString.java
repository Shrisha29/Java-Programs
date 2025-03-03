import java.util.Scanner;
class PalindromeString
{
public static void main(string []args)
{
Scanner sc =new Scanner(System.in);
System.out.println("enter the number : ");
String str = sc.next();
String rev1 =" ";

for(int i = str.length()-1; i>=0; i--)
{
rev1 = rev1 + str.charAt(i);
system.out.println(rev1);
if(rev1.equals(str))
{
System.out.println(str + "is palindrome");
}
else
{
System.out.println(str + "is not palindrome");
}
}
}