import java.util.ArrayList;
import java.util.Stack;

public class Rough {

    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> s=new ArrayList<>();
        boolean visited[]=new boolean[V];
        int source=0;
        s.push(source);
        while(!s.isEmpty()){
            source=s.remove(source);
            for(int i=0;i<adj.get(source).size();i++){
                int cur=adj.get(source).get(i);
                if(!visited[cur]){
                    s.add(cur); 
                }
            }
            if(!visited[source]){
                System.out.println(source);
                visited[source]=true;
            }

        }
        
        
    }
   
}
