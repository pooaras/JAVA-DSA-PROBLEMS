import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String a[]=s.split(",");
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        for(String k:a){

            System.out.println(k);
        }
        System.out.println();
        for(int k:b){

            System.out.println(k);
        }
    }
}
