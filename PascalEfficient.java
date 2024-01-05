import java.util.*;
public class PascalEfficient{
    public static List<List<Integer>> pascal(int numrows){
        List<List<Integer>> pascal=new ArrayList();
        for(int i=0;i<numrows;i++){
            List<Integer> row=new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==i || j==0){
                    row.add(1);
                }
                else{
                    List<Integer> prevrow=new ArrayList();
                    prevrow=pascal.get(i-1);
                    row.add(prevrow.get(j)+prevrow.get(j-1));
                }

            }
            pascal.add(row);
        }
        return pascal;
    }
    public static void main(String[] args) {
        
        int n=5;
        List<List<Integer>> lis=new ArrayList();
        lis=pascal(8);
        System.out.println(lis);
    }
}

//Nth index...
// class Solution {
//     public List<Integer> getRow(int rowIndex) {
//         int res=1;
//         List<Integer> row=new ArrayList();
//         row.add(res);
//         for(int j=1;j<=rowIndex;j++){
//             res=res*(rowIndex-j+1);
//             res=res/(j);
//             row.add(res);
//         }
//         return row;
//     }
// }