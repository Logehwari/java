int st1=0, esum=0, osum=0;
		while(input1!=0)
		{
			st1 = input1 % 10;
			if(st1%2 == 0)
			{
				esum += st1;
			}
			else
			{
				osum +=st1;
			}
			input1 /= 10;
		}
	return esum;	
	}
}
