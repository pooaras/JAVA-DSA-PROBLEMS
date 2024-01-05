public class MaxSubArrayKadane {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,sum=0,start=0,begin=0,end=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==0){
                start=i;
            }
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            begin=start;
            end=i;
      
        }
       return max;
    }
    public static void main(String[] args) {
        MaxSubArrayKadane obj=new MaxSubArrayKadane();
        System.out.println(obj.maxSubArray(new int[]{1,2,-3,-2,4,8}));
    }
}
