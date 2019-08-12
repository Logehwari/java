int count=0;
		int sr = input1 / 2;
		if(input1>1){
			for(int i=2; i<sr;i++)
			{
				if(input1%i == 0)
				{
					count++;
				}
					
			}

		}
		else
		{
			count++;
		}
	if(count==0){
		return 2;
	}
	else
	{
		return 1;
	}
		
	}
}
