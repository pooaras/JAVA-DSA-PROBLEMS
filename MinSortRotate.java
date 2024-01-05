public class MinSortRotate{
    public static int bin(int ar[]){
        int min=Integer.MAX_VALUE;
        int low=0;int high=ar.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[low]<=ar[mid]){
                min=Math.min(min,ar[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,ar[mid]);
                high=mid-1;
            }

        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(bin(new int[]{4,5,6,9,0,1}));
    }
}