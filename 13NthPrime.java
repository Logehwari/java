	 int count=0,i,j,sq;
    for(i=2;;i++)
    {
        if(isprime(i))
        {
            count++;
        }
        if(count == input1)
        break;
    }
    return i;
		
	}
	public boolean isprime(int n)
	{
		int sq,j;
		sq = (int)Math.sqrt(n);
		for(j=2;j<=sq;j++)
		if(n%j==0)
		return false;
		return true;
	}
}
