/**
 * InnerLinkedList
 */
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class InnerLinkedList {
    Node head;
    public void insert(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
        }
        else{
            //insertion in beginning
            // newnode.next=head;
            // head=newnode;
            
            //insert in last
            Node tem=head;
            while(tem.next!=null){
                tem=tem.next;
            }
            tem.next=newnode;
            }
        }
    
    }

    
public class LinkedList1 {

    public static void main(String[] args) {
        InnerLinkedList ilst=new InnerLinkedList();
        ilst.insert(8);
        ilst.insert(9);
        ilst.insert(7);
        int c=0;
        //Node temp=ilst.head;
        //brute force for middle in linked list
        // while(temp!=null){
        //     // System.out.println(ilst.head.data);
        //     temp=temp.next;c++;
        // }
        // for(int i=0;i<c/2;i++){
        //     ilst.head=ilst.head.next;
        // }
        Node twostep=ilst.head;
        Node onestep=ilst.head;
        while(twostep.next!=null && twostep!=null){
            twostep=twostep.next.next;
            onestep=onestep.next;
        }
        System.out.println(onestep.data);
    }
}
