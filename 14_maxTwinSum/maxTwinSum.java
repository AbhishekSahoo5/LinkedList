
public class maxTwinSum {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    // Find the maximum twin sum of a linked list of even length.
    // Twin of any node at (i)th index is the node at (n-i-1)th index. Twin sum is the sum of values of a node its twin.
    
    //You will always get even linked list

    public static int maxTwinSumm(Node head)
    {
        Node slow=head;
        Node fast=head;

        //To find left middle
        while(fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse
        Node newHead=reverse(slow.next);

        int max=0;
        int sum=0;
        Node first=head;
        Node second=newHead;
        while(second!=null)
        {
            sum=first.data+second.data;
            if(sum>max)
            {
                max=sum;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
        return max;
        
    }

    public static Node reverse(Node head)
    {
        if(head==null || head.next==null) 
            return head;

        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
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
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(10);
        Node e=new Node(5);
        Node f=new Node(6);
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
        System.out.println(maxTwinSumm(a));
        
        


    }
    
}
