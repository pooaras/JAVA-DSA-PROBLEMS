class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        next=null;
    }
}
class LinkedList{
    Node head;
    public Node insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        return head;
    }
}
public class DetectloopLInked {

    public static void main(String[] args) {
        LinkedList1 ls=new LinkedList1();
        Node tem=ls.insert(4);
        Node tem1=ls.insert(3);
        Node tem2=ls.insert(7);
        Node tem3=ls.insert(9);
        // while(tem3!=null){       
        //     System.out.println(tem3.data);
        //     tem3=tem3.next;
        // }
        Node two=ls.head;
        Node one=ls.head;
        while(two!=null && two.next!=null){
            one=one.next;
            two=two.next.next;
            if(one==two) System.out.println("true");
            else System.out.println(false);
        }
    }
    
}
