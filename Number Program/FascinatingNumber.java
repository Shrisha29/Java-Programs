import java.util.Scanner;
class FascinatingNumber //this number can be multiply only by 2 and 3
{
	public static void main(String[] args) 
	{
		int num = 327;
		String str = num+ "" +(num*2)+(num*3);
		boolean flag = true;
		//loop which start from 1 to 9 characters
		for(char i='1'; i<='9'; i++)
		{
			int cnt=0; //intitilize char count is equals to zero for every new char
			//frtch char from string one by one from 0 index
			for(int j=0; j<str.length(); j++)
			{
				char ch=str.charAt(j); //char fetched is stored in var ch
				if(ch==i) //if i char matches with ch char if executes
				cnt++; //increase the count if cnd satisfy
			}
			if(cnt!=1) //if cnt of char is not equals to 1 then if executes
			{
				flag = false; //re initilize the flag is cnt is not equals to 1
				break; //terminate the loop
			}
		}
		if(flag)
		{
			System.out.println(num+ " is Fascinating Number");
		}
		else
		{
			System.out.println(num + "is not Fascinating Number");
		}
	}
}
