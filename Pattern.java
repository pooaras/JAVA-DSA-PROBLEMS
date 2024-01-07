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

        //  ***********
        //   *********
        //    *******
        //     *****
        //      ***
        //       *
        for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++)
                System.out.print(" ");
                for(int j=n;j>i;j--)//remove = from j<=i to j<i
                System.out.print("*");
                for(int j=n-2;j>=i;j--)
                System.out.print("*");
            System.out.println();
        }
             
        // 1
        // 22
        // 333
        // 4444
        // 55555
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        // 1
        // 12
        // 123
        // 1234
        // 12345
         for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        // 12345
        // 1234
        // 123
        // 12
        // 1
          for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }


        // 1
        // 01
        // 101
        // 0101
        // 10101
        // 010101
        for(int i=1;i<=n;i++){
            int inc=0;
            if(i%2!=0) System.out.print(++inc);
            else System.out.print(inc);
            for(int j=1;j<i;j++){
                inc=1-inc;
                System.out.print(inc);
                }
                System.out.println();
            }
        



    }
}