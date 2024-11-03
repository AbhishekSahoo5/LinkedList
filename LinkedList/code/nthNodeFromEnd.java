package code;
public class nthNodeFromEnd {

    public static class Node{
        int data;
        Node next;

        Node (int data)
        {
            this.data=data;
        }

    }

    public static void legend(Node head, int n)
    {
        Node slow=head;
        Node fast=head;

        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
    }

    //By two Traversal
    public static Node nthNodeFromLast(Node head,int n)
    {
            int size=0;
            Node temp=head;
            while(temp!=null)
            {
                size++;
                temp=temp.next;
            }
            int m=size-n+1;

            temp=head;
            for(int i=1;i<m;i++)
            {
                temp=temp.next;
            }
            return temp;
    }    

    //By One Traversal
    public static Node nthNodeFromLastByOneTraversal(Node head, int n)
    {
        Node slow=head;
        Node fast=head;

        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }


    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static Node deleteNthNodefromEnd(Node head,int n)
    {
            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++)
            {
                fast=fast.next;
            }
            if(fast==null)
            {
                head=head.next;
                return head;
            }

            while(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
            return head;
        
    }
    
    
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        //100 13 4 5 12 10
        Node q=nthNodeFromLast(a,3);
        System.out.println(q.data);

        System.err.println("-----------------");
      

        Node r=nthNodeFromLastByOneTraversal(a,3);
        System.out.println(r.data);

        display(a);
        System.out.println();

        legend(a,2);
        display(a);

        // Node node1=deleteNthNodefromEnd(a, 3);
        // display(node1);

        // System.out.println();

        // Node node2=deleteNthNodefromEnd(a, 5);
        // display(node2);


        

    }
    
}
