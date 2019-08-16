import java.io.*;
import java.util.*;

class UserManiCode
{
   public int lastDigit(int input1, int input2){

int ls1 = Math.abs(input1);
int ls2 = Math.abs(input2); 
int lss1 = ls1%10;
int lss2 = ls2%10;
int lg1 = lss1 + lss2;
return lg1;

}
}

