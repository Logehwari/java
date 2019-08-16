import java.io.*;
import java.util.*;

class UserManiCode
{
   public int secondLastDigit(int input1){

int ls1 = Math.abs(input1);
int ls2 = ls1 / 10;
int ls3 = ls2 % 10;
return ls3;

}
}

