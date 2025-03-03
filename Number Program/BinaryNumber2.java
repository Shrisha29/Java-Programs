import java.util.Scanner;
class  BinaryNumber2  //without using loop
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		String bin = Integer.toBinaryString(num);
		System.out.println(bin);
	}
}
