import java.io.*;
import java.util.*;

class UserManiCode
{
   public int fact(int input1){
		int fact=1;
		if(input1 == 0)
		{
			return 1;
		}
		 else
		{
			for(int i=1; i<=input1; i++)
			{
				fact=fact*i;
			}
		}
	return fact;
	}
}
