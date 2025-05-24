import java.io.*;
import java.util.*;
class Sort0and1and2{
    public static int[] sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i: nums){
            if(i==0){
                count0+=1;
            }
            else if(i==1){
                count1+=1;
            }
            else if(i==2){
                count2+=1;
            }
        }

        for(int i=0;i<count0;i++){
            nums[i]=0;
        }
        for(int i=count0;i<count1+count0;i++){
            nums[i]=1;
        }
        for(int i=count1+count0;i<nums.length;i++){
            nums[i]=2;
        }
return nums;
        
        }
public static void main(String []args)
{
int[] arr={2,0,2,1,1,0};
int[] result=sortColors(arr);
System.out.println(Arrays.toString(result));
}
        
    }
