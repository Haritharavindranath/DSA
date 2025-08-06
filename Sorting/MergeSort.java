import java.util.*;
class MergeSort
{
    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        int[] ans=divide(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] divide(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int[] left=divide(Arrays.copyOfRange(arr,0,arr.length/2));
        int[] right=divide(Arrays.copyOfRange(arr,arr.length/2,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right)
    {
        int[] ans=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                ans[k]=left[i];
                i++;
            }
            else {
                ans[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length)
        {
            ans[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length)
        {
            ans[k]=right[j];
            j++;
            k++;
        }
        return ans;
    }
}