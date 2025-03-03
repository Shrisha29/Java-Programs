class SumOfDigitEvenOdd
{
public static void main(string[]args)
{
int num = 1234;
int evenSum=0;
int oddSum=0;
int temp=0;
int rum=num%10;
temp=(rem%2==0) ? (evenSum=evenSum+rem) : (oddSum=Oddsum+rem);

num = num/10;
rem = num%10;
temp=(rem%2==0) ? (evenSum=evenSum+rem) : (oddSum=Oddsum+rem);

num = num/10;
rem = num%10;
temp=(rem%2==0) ? (evenSum=evenSum+rem) : (oddSum=Oddsum+rem);

System.out.println("Even sum :"+evenSum);
System.out.println("Odd sum :"+oddSum);

}
}

