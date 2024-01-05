public class Recursion {
    public static int recur(int n){
        // int n=10;ut
        System.out.println(n);
        if(n==0)
            return 0;
        else
            return recur(n-1);
        
    }
    public static void main(String[] args) {
    recur(10);   
    }
}
