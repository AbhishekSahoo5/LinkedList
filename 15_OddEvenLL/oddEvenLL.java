
public class oddEvenLL {

    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node oddEvenList(Node head)
    {
        Node odd=new Node(0);
        Node even=new Node(0);

        Node temp=head;
        Node tempo=odd;
        Node tempe=even;

        while(temp!=null)
        {
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;

            tempe.next=temp;
            if(temp==null)
            {
                break;
            }
            temp=temp.next;
            tempe=tempe.next;
        }
        odd=odd.next;
        even=even.next;

        tempo.next=even;
        return odd;
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
        Node res=oddEvenList(a);
        display(res);
        
        


    }
    
}
