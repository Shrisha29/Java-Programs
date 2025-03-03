import java.util.Scanner;
class LowercaseLogic
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Charater: ");
char ch = sc.next().charAt(0);

System.out.println((ch>='a' && ch<='z') ? ("it is an Lowercase") : ("it is not an Lowercase"));
}
}