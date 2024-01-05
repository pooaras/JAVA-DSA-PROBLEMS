import java.util.*;
public class NextPermutation {

    public static int[] sort(int arr[],int begin,int end){
        for(int i=begin;i<end-1;i++){
            for(int j=i+1;j<end;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                index=i-1;break;
            }
        }
        if(index!=-1){
            for(int i=nums.length-1;i>index;i--){
                if(nums[i]>nums[index]){
                    int temp=nums[i];
                    nums[i]=nums[index];
                    nums[index]=temp;
                    break;
                }
            }
            
            int newarr[]=sort(nums,index+1,nums.length);
            for(int i=index+1;i<nums.length;i++){
                nums[i]=newarr[i];
            }
        }
        else{
            Arrays.sort(nums);
        }
        for(int i:nums){
            System.out.println(i);
        }

    
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,4,3,0,0};
        nextPermutation(arr);
    }

}
