import java.io.*;
import java.util.*;

class UserManiCode
{
   public int 14PrimeRange(int input1, int input2){
      int i =0;
		int num =0;
		int counter=0;
		for (i = input1; i <= input2; i++)         
		{ 		  	  
			 	  
		    for(num =i; num>=input1/2; num++)
			{
		        
		    	if(i%num==0)
				{
		 			counter = counter + 1;
				}
			}
			  
		}   	
		       
		
		
		return counter;
	


		
	}
}
      
