 int s1, count=0,count1=0;
		int[] arr = {input1, input2, input3, input4, input5};
		for(int i=0; i<5; i++)
		{
			s1 = arr[i]%2;
			if(s1==0)
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		
	
    return count1;

		
	}
}
