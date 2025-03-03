import java.util.Scanner;
class PrimeNumber
{
public static void main(String[]atgs)
{
Scanner sc = new Scanner(System.in);
System.out.printS("Enter the no. :");
int num = sc.nextInt(); //5

System.out.println((num == 2 || num == 3) ? (num + " is prime") : ((num%2 == 0 || num%3 == 0) ? (num + " is a prime") : (num + " is prime")) );
}
}