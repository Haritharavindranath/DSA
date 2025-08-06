import java.util.*;
class InsertionSort
{
    public static void main(String[] args)
    {
        int[] arr={3,1,5,4,2};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}