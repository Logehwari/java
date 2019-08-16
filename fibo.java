import java.io.*;
import java.util.*;

class UserManiCode
{
   public int fibo(int input1){


return fib(input1-1);
}
public long fib(int i)
{
	if(i==0)
		return 0;
	if(i==1)
		return 1;
return fib(i-1)+fib(i-2);
}

		
	
}
