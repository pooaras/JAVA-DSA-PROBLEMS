import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class MaxNbythree{
    public static List<Integer> majorityElement(int[] nums) {
        Hashmap<Integer,Integer> hm=new Hashmap<>();
        List<Integer> ls=new ArrayList<>();
        int c=0;
        int n=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))
                hm.put(nums[i],hm.get(nums[i])+1);
            else
                hm.put(nums[i],c+1);
            if(hm.get(nums[i])==n+1){
                ls.add(nums[i]);
            }
        }
    //    hm.forEach((k,v) 
    //    -> {if(v>n) ls.add(k);} );
         return ls;

    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }
}



    // public static List<Integer> majorityElement(int[] nums) {
    //     int n=nums.length;
    //     List<Integer> ls=new ArrayList<Integer>();
    //     for(int i=0;i<nums.length;i++){
    //         int count=0;
    //         for(int j=0;j<nums.length;j++){
    //         if(nums[i]==nums[j])
    //             count++;
    //         }
    //         if(count>(n/3) && !ls.contains(nums[i])){
    //             ls.add(nums[i]);
    //         }

    //     }
    //     return ls;
    // }





// import java.util.*;

// public class tUf {
//     public static List<Integer> majorityElement(int []v) {
//         int n = v.length; //size of the array

//         int cnt1 = 0, cnt2 = 0; // counts
//         int el1 = Integer.MIN_VALUE; // element 1
//         int el2 = Integer.MIN_VALUE; // element 2

//         // applying the Extended Boyer Moore's Voting Algorithm:
//         for (int i = 0; i < n; i++) {
//             if (cnt1 == 0 && el2 != v[i]) {
//                 cnt1 = 1;
//                 el1 = v[i];
//             } else if (cnt2 == 0 && el1 != v[i]) {
//                 cnt2 = 1;
//                 el2 = v[i];
//             } else if (v[i] == el1) cnt1++;
//             else if (v[i] == el2) cnt2++;
//             else {
//                 cnt1--; cnt2--;
//             }
//         }

//         List<Integer> ls = new ArrayList<>(); // list of answers

//         // Manually check if the stored elements in
//         // el1 and el2 are the majority elements:
//         cnt1 = 0; cnt2 = 0;
//         for (int i = 0; i < n; i++) {
//             if (v[i] == el1) cnt1++;
//             if (v[i] == el2) cnt2++;
//         }

//         int mini = (int)(n / 3) + 1;
//         if (cnt1 >= mini) ls.add(el1);
//         if (cnt2 >= mini) ls.add(el2);

//         // Uncomment the following line
//         // if it is told to sort the answer array:
//         //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

//         return ls;
//     }

//     public static void main(String args[]) {
//         int[] arr = {11, 33, 33, 11, 33, 11};
//         List<Integer> ans = majorityElement(arr);
//         System.out.print("The majority elements are: ");
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }
