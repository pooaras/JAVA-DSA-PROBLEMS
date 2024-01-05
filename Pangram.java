import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next().toLowerCase();
        String comp="abcdefghijklmnopqrstuvwxyz";
        if(str.equals(comp))
        System.out.println("isAnagram");
        else System.out.println("isNotAnagram");
        sc.close();
    }
}
