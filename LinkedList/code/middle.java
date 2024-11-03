package code;
public class middle {

    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node middleElement(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node g=new Node(200);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
      

        a.next=b;
        b.next=c;
        c.next=d;
        c.next=g;
        g.next=d;
        d.next=e;
        e.next=f;
        f.next=null;

        Node res=middleElement(a);
        System.out.println(res.data);


    }
    
}
