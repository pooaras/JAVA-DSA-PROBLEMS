import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;


public class GraphBFS {
    int v;
    ArrayList<Integer>[] graph;
    @SuppressWarnings("unchecked")

    GraphBFS(int noOfv){
        v=noOfv;
        graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
    }
    public void adjacencyList(int node1,int node2){
        graph[node1].add(node2);
    }
    public void BFS(int source){ //using queue and boolean visited array for BFS
        boolean visited[]=new boolean[v];
        ArrayList<Integer> que=new ArrayList<>();
        que.add(source);visited[source]=true;
        while(!que.isEmpty() ){
            source=que.remove(0);
            System.out.println(source);
            Iterator<Integer> i=graph[source].iterator();
            while(i.hasNext()){
                int cur=(int)i.next();
                if(visited[cur]!=true)
                que.add(cur);
                visited[cur]=true;
            }

        }
    }
    public void DFS(int source){//using stack and boolean array for DFS
        boolean b[]=new boolean[v];
        Stack<Integer> stac=new Stack<>();
        stac.push(source);
        int cur;
        while(stac.isEmpty()!=true){
            cur=stac.peek();
            stac.pop();
            for(int i=0;i<graph[cur].size();i++){
                int el=graph[cur].get(i);
                if(!b[el])
                stac.push(el);
            }
            if(!b[cur]){
                b[cur]=true;
                System.out.println(cur);
            }
        }
    }
    public static void main(String[] args) {
        GraphBFS ob=new GraphBFS(6);
        ob.adjacencyList(0, 1);
        ob.adjacencyList(0,2);
        ob.adjacencyList(0,5);
        ob.adjacencyList(1,0);
        ob.adjacencyList(1,2);
        ob.adjacencyList(2,0);
        ob.adjacencyList(2,1);
         ob.adjacencyList(2,2);
         ob.adjacencyList(2,3);
         ob.adjacencyList(2,4);
         ob.adjacencyList(3,2);
         ob.adjacencyList(4,2);
         ob.adjacencyList(4,5);
         ob.adjacencyList(5,0);
         ob.adjacencyList(5,4);
         System.out.println("BFS");
        ob.BFS(0);
        System.out.println("DFS");
        ob.DFS(0);
    }   
}
