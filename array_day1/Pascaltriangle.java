import java.io.*;
import java.util.*;
class Pascaltriangle{
public static List<List<Integer>> pascal(int numRows)
{
List<List<Integer>> a=new ArrayList();
for(int i=0;i<numRows;i++)
{
List<Integer> b=new ArrayList<>();
for(int j=0;j<=i;j++)
{
if(j==0||j==i)
{
b.add(1);
}
else 
{
int val=a.get(i-1).get(j-1)+a.get(i-1).get(j);
b.add(val);
}
}
a.add(b);
}
return a;
}

public static void main(String []args)
{
int n=5;
List<List<Integer>> result=new ArrayList();
result=pascal(n);
for(List<Integer> x:result){
System.out.println(x);
}
}
}