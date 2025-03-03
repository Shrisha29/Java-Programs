import java.util.Scanner;
class UppercaseLogic
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Charater: ");
char ch = sc.next().charAt(0);

System.out.println((ch>='A' && ch<='Z') ? ("it is an uppercase") : ("it is not an uppercase"));
}
}