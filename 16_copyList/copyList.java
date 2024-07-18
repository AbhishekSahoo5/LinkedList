
public class copyList {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    //Copy list with Random Pointer: Construct a deep copy of a linked list where each node contains an additionsl random pointer, which could point to any node in the list or null.

    /*
     * Steps
     * 1) Create a deep copy   (of next)
     * 2) Alternate connection of the list
     */

    public static Node createDeepCopy(Node head)
    {
        Node temp1=head;
        Node newHead=new Node(-1);
        Node temp2=newHead;
        

        while(temp1!=null)
        {
            Node newNode=new Node(temp1.data);
            temp2.next=newNode;
            temp2=temp2.next;
            temp1=temp1.next;
        }
        newHead=newHead.next;
        return newHead;
    }

    public static Node copyListWithRandomPointer(Node head)
    {
        
    }

    

    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(1);
        Node c=new Node(3);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(4);
        Node g=new Node(7);
        Node h=new Node(10);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=null;

        display(a);
        Node res=createDeepCopy(a);
        display(res);
        
        


    }
}
