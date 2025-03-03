import java.util.Scanner;
class VowelLogic
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the vowel:");
char ch=sc.next().charAt(0);

String op =((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch+"is an vowel"):(ch+"is a consonent"));
System.out.println(op);
}
}
