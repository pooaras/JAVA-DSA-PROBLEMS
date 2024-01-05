import java.util.Arrays;
class Solution {
    public static int minOperations(int[] nums) {
        int op=0;
        Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count=count+1;
                // System.out.println(count+"i");
            }
            else{
                if(count==1) return -1;
                if(count>1 ){  
                    if(count%2==0)
                        op+=count/2;
                    if(count%3==0)
                        op+=count/3;
                    count=1;
                    // System.out.println("op"+op);
                }
            }
        }
          if(count>1 ){
                    if(count%2==0)
                        op+=count/2;
                    if(count%3==0)
                        op+=count/3;
                    count=1;
                    // System.out.println("op"+op);
                }
            if(count==1) return -1;
            else return op;
    }
    public static void main(String[] args) {
          System.out.println(minOperations(new int []{2,3,3,2,2,4,2,3,4}));;
    }
}