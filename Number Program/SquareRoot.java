class SquareRoot
{
public static void main(String []args)
{
int num = 36;
boolean flag = false;

for(int i =1; i<=num; i++)
{
if(i*i==num)
{
flag = true;
System.out.println(i+" is a perfect sqrt for "+num);
}

if(i*i>num)
break;
}

if(!flag)
System.out.println(num+" is not having a perfect sqrt");
}
}