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
                inc=1-inc;//flip 1 to 0 or 0 to 1
                System.out.print(inc);
                }
                System.out.println();
            }
            // char c='A'+1;
            //print(c+1)=>66 not B
            
            // A
            // AB
            // ABC
            // ABCD
            // ABCDE
            for(int i=0;i<n;i++){
                for(char c='A';c-66<i;c++){
                    System.out.print(c);
                }
                System.out.println();
            }
            // ABCDE
            // ABCD
            // ABC
            // AB
            // A
             for(int i=n-1;i>=0;i--){
                for(char c='A';c-66<i;c++){
                    System.out.print(c);
                }
                System.out.println();
            }
            // A
            // BB
            // CCC
            // DDDD
            // EEEEE
            for(char c='A';c-65<n;c++){
                for(int i=0;i+65<=c;i++){
                    System.out.print(c);
                }
                System.out.println();
            }
            // 1 
            // 2 3 
            // 4 5 6 
            // 7 8 9 10 
            // 11 12 13 14 15 
            // 16 17 18 19 20 21 
            int ct=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++)
                System.out.print(ct+++" ");
                System.out.println();
            }

            // 1      1
            // 12    21
            // 123  321
            // 12344321
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                for(int j=n-i;j>0;j--){
                    System.out.print(" ");
                }
                for(int j=n-i;j>0;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i-j+1);
                }
                System.out.println();
            }
            // E
            // ED
            // EDC
            // EDCB
            // EDCBA
            for(int i=0;i<n;i++){//wrong
                char c='E';
                for(int j=0;j<=i;j++){
                    System.out.print(c--);
                }
                System.out.println();
            }
            for(int i=1;i<=n;i++){
                for(char c=(char)('A'+n-i);c<='A'+n-1;c++){
                    System.out.print(c);
                }
                System.out.println();
            }

    }
}