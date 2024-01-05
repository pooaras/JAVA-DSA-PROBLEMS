import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class tripletZero {
  
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1,k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ArrayList<Integer> ar=new ArrayList<>();
                    Collections.addAll(ar,nums[i],nums[j],nums[k]);
                    ls.add(ar);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k]) k--;
                }
                if(sum<0) j++;
                if(sum>0) k--;
            }
        }
        return ls;
    }
    public static void main(String[] args) {
        tripletZero obj=new tripletZero();
        System.out.println(obj.threeSum(new int[]{-1,0,1,2,-1,3}));
    }
}



//Better approach

// import java.util.*;

// public class tUf {
//     public static List<List<Integer>> triplet(int n, int[] arr) {
//         Set<List<Integer>> st = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             Set<Integer> hashset = new HashSet<>();
//             for (int j = i + 1; j < n; j++) {
//                 //Calculate the 3rd element:
//                 int third = -(arr[i] + arr[j]);

//                 //Find the element in the set:
//                 if (hashset.contains(third)) {
//                     List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
//                     temp.sort(null);
//                     st.add(temp);
//                 }
//                 hashset.add(arr[j]);
//             }
//         }

//         // store the set elements in the answer:
//         List<List<Integer>> ans = new ArrayList<>(st);
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = { -1, 0, 1, 2, -1, -4};
//         int n = arr.length;
//         List<List<Integer>> ans = triplet(n, arr);
//         for (List<Integer> it : ans) {
//             System.out.print("[");
//             for (Integer i : it) {
//                 System.out.print(i + " ");
//             }
//             System.out.print("] ");
//         }
//         System.out.println();
//     }
// }


// 2 sum
// import java.util.*;

// public class Main {
//     public static String twoSum(int n, int []arr, int target) {
//         Arrays.sort(arr);
//         int left = 0, right = n - 1;
//         while (left < right) {
//             int sum = arr[left] + arr[right];
//             if (sum == target) {
//                 return "YES";
//             } else if (sum < target) left++;
//             else right--;
//         }
//         return "NO";
//     }

//     public static void main(String args[]) {
//         int n = 5;
//         int[] arr = {2, 6, 5, 8, 11};
//         int target = 14;
//         String ans = twoSum(n, arr, target);
//         System.out.println("This is the answer for variant 1: " + ans);

//     }

// } 
