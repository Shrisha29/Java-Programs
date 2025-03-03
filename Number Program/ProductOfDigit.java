class ProductOfDigit
{
public static void main(string[]args)
{
int num = 1234;
int product;
int rem1 = num%10;
num = num/10;

int rem2 = num%10;
product = rem1*rem2;
num = num/10;

int rem3 = num%10;
product = product*rem3;
num = num/10;

product = product*num;
System.out.println("Product of digit is : "+Product);
}
}

