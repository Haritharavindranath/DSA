import java.io.*;
import java.util.*;
class Buyandsellstock{
public static void main(String [] args)
{
int[] price={7,6,4,3,1};
int minprice=Integer.MAX_VALUE;
int maxprofit=0;
for(int i:price){
if(i<minprice)
{
minprice=i;
}
else
{
maxprofit=Math.max(maxprofit,i-minprice);
}
}
System.out.println(maxprofit);
}
}