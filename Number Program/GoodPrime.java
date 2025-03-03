class GoodPrime
{
	public static void main(String []args)
	{
		int range = 50;
		for(int k=1; k<=range; k++)
		{
			int num = k;
			boolean flag = true;
			if(num<2)
				flag = false;
			for(int i=2; i<num; i++)
			{
				if (num%i==0)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				int prime = num;
				if(prime>9)
				{
						boolean flag1 = true;
						outerloop:
							for (int i=prime; i>0; i/=10)
							{
							int dgt = i%10;
							if(dgt<2)
								{
								flag1 = false;
								break outerloop;
								}
								for(int m=2; m<dgt; m++)
								{
									if(dgt%m==0)
									{
										flag1 = false;
										break outerloop;
									}
								}
							}
							if(flag1)
					        {
								System.out.println(prime+" ");
					        }

				           else
					       {
					       System.out.println(prime +" ");
					       }
					}
				}
		}
	}
}
