class PalindromeNumber
{
public static void main(String [] args)
{
int num = 121;
int rev = 0;
for (int i = num; i>0 ;i/=10)
{
rev = rev * 10 +(i % 10);
}
if(num == rev)
{
System.out.println("Number is Palindrome");
}
else 
{
System.out.println("Number is not a palindrome");
}
}
}