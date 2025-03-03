class MaxDigitNumber
{
public static void main(String []args)
{
int num = 58957363;
int max = 0;
for(int i = num; i>0 ; i/=10)
{
int dgt = i%10;
if(max < dgt) 
max = dgt ;
}
System.out.println("Largest dgt from "+ num +" is " + max);
}
}