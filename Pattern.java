import java.util.Scanner;

/**
 * Pattern
 */
public class Pattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stars:");
        int n=sc.nextInt();
        // enter the number of stars:
        // 4
        // ****
        // ****
        // ****
        // ****
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print("*");
            System.out.println();
        }
        // *
        // **
        // ***
        // ****
         for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
        // *****
        // ****
        // ***
        // **
        // *
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--)
            System.out.print("*");
            System.out.println();
        }
        //    *
        //   **
        //  ***
        // ****
         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++)
            System.out.print(" ");
            for(int j=0;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
        //  ******
        //   *****
        //    ****
        //     ***
        //      **
        //       *
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
            System.out.print(" ");
            for(int j=n;j>i;j--)
            System.out.print("*");
            System.out.println();
        }
        //      *
        //     * *
        //    * * *
        //   * * * *
        for(int i=0;i<n;i++){//add space form previous left side triangle 
            for(int j=i;j<n;j++)
            System.out.print(" ");
            for(int j=0;j<=i;j++)
            System.out.print(" *");
            System.out.println();
        }

        //combine 2nd and 3rd
        //       *
        //      ***
        //     *****
        //    *******
        //   *********
        //  ***********
        for(int i=0;i<n;i++){
                for(int j=i;j<n;j++)
                System.out.print(" ");
                for(int j=0;j<=i;j++)
                System.out.print("*");
                for(int j=0;j<i;j++)//remove = from j<=i to j<i
                System.out.print("*");
            System.out.println();
          
        }
        for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++)
                System.out.print(" ");
                for(int j=n;j>i;j--)//remove = from j<=i to j<i
                System.out.print("*");
                for(int j=n-2;j>=i;j--)
                System.out.print("*");
            System.out.println();
        }

    }
}