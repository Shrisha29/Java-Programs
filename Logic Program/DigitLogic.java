import java.util.Scanner;
class DigitLogic
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Charater: ");
char ch = sc.next().charAt(0);

System.out.println((ch>='0' && ch<='9') ? ("it is a digit") : ("it is not a digit"));
}
}