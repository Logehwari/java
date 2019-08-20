import java.io.*;
import java.util.*;

class UserManiCode
{
   public int 16UniqueDigits(int input1){

int a[] = new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=0;
		}
		int count=0;
		while(input1 !=0)
		{
			int r=input1%10;
			a[r]++;
			if(a[r]==1)
			{
				count++;
			}
			input1 = input1/10;

		}
	return count;
        		
	}
}
