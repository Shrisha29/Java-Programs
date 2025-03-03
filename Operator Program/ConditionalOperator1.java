class ConditionalOperator
{
public static void main (String args[])
{
int a=25;
int b= 4;
int c=5;
int lar = (a<b) ? ((a<c)?(a):(c)) : ((b<c) ?(b):(c));
System.out.println(lar);
}
}
