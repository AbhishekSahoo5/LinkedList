
public class splitLL {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    //Given a linked list, split it into two lists such that one contains odd values, while the other contains even values.

    public static Node[] startOfLoop(Node head)
    {
        Node odd=new Node(-1);
        Node even=new Node(-1);

        Node temp=head;

        Node tempOdd=odd;
        Node tempEven=even;
        while(temp!=null)
        {
            if(temp.data%2!=0)
            {
                tempOdd.next=temp;
                tempOdd=tempOdd.next;
            }
            else{
                tempEven.next=temp;
                tempEven=tempEven.next;
            }
            temp=temp.next;
            tempOdd.next=null;
            tempEven.next=null;
        }

        Node[] nodes=new Node[2];
        nodes[0]=odd.next;
        nodes[1]=even.next;
        return nodes;
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
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=null;

        display(a);

        Node nodes[]=startOfLoop(a);
        Node head1=nodes[0];
        Node head2=nodes[1];


        System.out.print("Odd   ");
        display(head1);
        System.out.print("Even   ");
        display(head2);


    }
    
}
