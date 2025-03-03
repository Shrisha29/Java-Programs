class LeastRepeatingNumber
{
public static void main(String []args)
{
long num = 123456789123456789l;
System.out.println(num);
int dgt = 0;
int min = Integer.MAX_VALUE;

for(int i = 0; i<=9; i++)
{
int cnt = 0;
for(long j = num; j>0; j/=10)
{
long rem = j%10;
if(i == rem)
{
cnt ++;
}
}
if(cnt! = 0)
{
if(cnt < min)
{
min = cnt;
dgt = i;
}
}
}
System.out.println("Least Repeated Num is "+ dgt + "with a frequency of " + min);
}
}