class Solution {
    public int trap(int[] height) {
        int tem=0;
        int n=height.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=height[0];
        suffix[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            tem+=Math.min(prefix[i],suffix[i])-height[i];
        }
        return tem;
    }
}
public class TrappingWater {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.trap(new int[]{4,7,3,5,9,4,9,4}));
    }
}
//   public int trap(int[] height) {
//         int tem=0;
//         for(int i=0;i<height.length-1;i++){
//             int leftmax=0,rightmax=0;
//             for(int j=0;j<=i;j++){
//                 leftmax=Math.max(leftmax,height[j]);
//             }
//             for(int j=i;j<height.length;j++){
//                 rightmax=Math.max(rightmax,height[j]);
//             }
//             tem+=Math.min(leftmax,rightmax)-height[i];
//         }
//         return tem;
//     }