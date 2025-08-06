import java.util.*;
class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr={3,1,5,4,2};
        for(int i=0;i<arr.length-1;i++)
        {
            int index=getmax(arr,i);
            int temp=arr[index];
            arr[index]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int getmax(int[] arr,int i)
    {
        int index=0;
        int max=0;
        for(int k=0;k<arr.length-i;k++)
            {
                if(arr[k]>max)
                {
                    max=arr[k];
                    index=k;
                }
            }
        return index;
    }
}