
public class mergeTwoLL {

    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    
    public static Node mergeTwoLL(Node head1,Node head2)
    {
        Node temp1=head1;
        Node temp2=head2;

        Node dNode=new Node(-1);
        Node temp=dNode;

        while(temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1!=null)
        {
            temp.next=temp1;
        }
        else
        {
            temp.next=temp2;
        }
        return dNode.next;

        // Time Complexity= O(n1+n2)
        // Space Complexity= O(1)
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

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;

        Node a1=new Node(1);
        Node b1=new Node(2);
        Node c1=new Node(3);
        Node d1=new Node(4);
        Node e1=new Node(5);
        Node f1=new Node(6);

        a1.next=b1;
        b1.next=c1;
        c1.next=d1;
        d1.next=e1;
        e1.next=f1;
        f1.next=null;
        

        display(a);
        display(a1);
        Node res=mergeTwoLL(a, a1);
        display(res);
        
    }
    
}
