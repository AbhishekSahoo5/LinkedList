
public class removeDUP {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    //Remove duplicates from a sorted list

    public static Node removeDuplicate(Node head)
    {
        if(head==null)
        {
            return null;
        }
        Node prev=head;
        Node curr=head.next;

        while(curr!=null)
        {
            if(prev.data==curr.data)
            {
                prev.next=curr.next;
                curr=curr.next;
            }
            else
            {
                prev=curr;
                curr=curr.next;
            }
        }
        return head;
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
        Node b=new Node(1);
        Node c=new Node(3);
        Node d=new Node(3);
        Node e=new Node(5);
        Node f=new Node(5);
        Node g=new Node(7);
        Node h=new Node(7);
        Node i=new Node(7);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=null;

        display(a);
        removeDuplicate(a);
        display(a);

    


    }
    
}
