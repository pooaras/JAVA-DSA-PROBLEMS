import java.util.Arrays;
public class duplicateArray{
    public static void main(String[] args) {
        int a[]={1,4,5,6,3,3,4,5,6,7,4};
        int count;int j;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            count=1;
            for(j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    //System.out.print(a[i]+" ");
                }
                else{
                    break;
                }
            }
            i=j-1;
            if(count>1){
                System.out.print(a[i]+"->"+count+",");
            }
        }
        
    }
}