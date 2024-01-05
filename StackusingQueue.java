import java.util.LinkedList;
import java.util.Queue;
public class StackusingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<6;i++)
        queue.add(i);

        queue.add(7);
        for(int i=0;i<queue.size()-1;i++){
            queue.add(queue.remove());
        }

        System.out.println(queue.remove()+" "+queue.peek()+ " ");

    }
    
}
