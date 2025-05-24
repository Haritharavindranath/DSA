import java.io.*;
import java.util.*;
class Kadanesalgo{
public static void main(String []args)
{
int[] arr={-2,1,-3,4,-1,2,1,-5,4};
int maxsum=arr[0];
int currentsum=arr[0];
for(int i=0;i<arr.length;i++)
{
currentsum=Math.max(arr[i],currentsum + arr[i]);
maxsum=Math.max(maxsum,currentsum);
}
System.out.println(maxsum);
}
}