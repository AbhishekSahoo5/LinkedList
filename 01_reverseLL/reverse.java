
public class reverse {

    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node reverseIrerative(Node head)
    {
        //If ll in empty
         if(head==null || head.next==null)
        {
            return head;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;  
        }
        head.next=null;
        head=prevNode;
        return head;  
    }

    public static Node reverseRecursive(Node head)
    {
        if(head==null)
        {
            return head;
        }
        Node newHead=reverseIrerative(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;

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

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;

        display(a);
        Node head=reverseIrerative(a);
        display(head);
        Node hea=reverseRecursive(head);
        display(hea);

        
    }

    
}
