class Loop2  //label loop
{
	public static void main(String[] args) 
	{
		outerloop:     //label name (for outerloop)
		{
			for(int i=1; i<=3; i++)
			{
				innerloop:   //label name (for innerloop)
					for(int  j=1; j<=3; j++)
				{
						if(j==2)
							break outerloop;
						System.out.println(i+ " : " +j);
				}
			}
		}
	}
}
