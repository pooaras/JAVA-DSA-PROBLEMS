public class Pascal {
    public static void main(String[] args) {
        int n=8,res=1,c=3;n--;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i+1;j++){
                res=1;
                for(int k=0;k<j-1;k++){
                    res=res*(i-k);
                    res=res/(k+1);
                }

                System.out.print(res+" ");
            }
            System.out.println();
        }
}
}