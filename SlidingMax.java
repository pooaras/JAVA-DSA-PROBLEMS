import java.util.*;
public class SlidingMax {
    public static int [] SlidingMaximum(int nums[],int k){
        int arr[]=new int[nums.length-k+1],max=0;
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
            while(q.isEmpty()==false && nums[q.peekLast()]<nums[i]){
                q.removeLast();
            }
            if(!q.isEmpty() && q.peek()==i-k){
                q.remove();
            }
            q.add(i);
            if(i>=k-1) arr[max++]=nums[q.peek()];
        }

        return arr;
    }

    public static void main(String[] args) {
     for(int i:SlidingMaximum(new int[]{1,3,-1,-3,5,3,6,7}, 3)){
        System.out.println(i);
     } 
    }
    
}
