import java.util.LinkedList;
// That returns an Object of type Object, (that is so generic), into an ArrayList, and the compiler tries to say you that, it could be any other type of objects.

// In my opinion its not an important warning if that instruction in your code is always returning ArrayList, so i would add to your method definition.

// @SuppressWarnings("unchecked")
class Graph{
    int v; //vertex

    LinkedList<Integer>[] adj;//adjacency list
    @SuppressWarnings("unchecked")
    Graph(int noOfv){
        v=noOfv;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    void edge(int node1,int node2){
        adj[node1].add(node2);
    }


    public static void main(String[] args) {
        int no=3;
        Graph g=new Graph(8);
        g.edge(5,6);
        g.edge(6,3);
    }
}