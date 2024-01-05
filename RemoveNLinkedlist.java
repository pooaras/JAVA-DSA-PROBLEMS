class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
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
public class RemoveNLinkedlist {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.insert(8);
        ls.insert(9);
        Node head=ls.insert(3);
        Node one=head;
        Node two=head;
        int n=2;
        for(int i=1;i<=n;i++){
            two=two.next;
        }
        while(two.next!=null){
            one=one.next;
            two=two.next;
        }
        one.next=one.next.next;
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
}
