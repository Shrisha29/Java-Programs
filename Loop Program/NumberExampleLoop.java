import java.util.Scanner;  
class NumberExample1
{
public static void main(String []args)
{
System.out.println("enter the number:");
int num = new Scanner(System.in).nextInt();
int sum=0; //3
while(num>0)  //cond
{
int rem = num%10;   //last digit
if(rem%2==0)
{
sum +=rem;
//System.out.println(rem);  //print the Last digit
  num = num/10;  //update by removing last digit
}
System.out.println(sum);  
//System.out.println(num);  
}
}