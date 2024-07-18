
public class palindromeLL {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node reverse(Node head)
    {
        Node prevNode=head;
        Node currNode=head.next;

        if(head==null || head.next==null)
        {
            return head;
        }
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
        return head;
    }

    public static boolean checkPalindrome(Node head)
    {
        //left middle
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        //Reverse
        Node newHead=reverse(slow.next);


        //Compare 
        Node first=head;
        Node second=newHead;

        while(second!=null)
        {
            if(first.data!=second.data)
            {
                reverse(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
        return true;

    }

    //Time Complexity =O(n/2+n/2+n/2+n/2) = O(2n)
    // Space Complexity = O(1)


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
        Node d=new Node(3);
        Node e=new Node(2);
        Node f=new Node(1);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;

        display(a);
    
        System.out.println(checkPalindrome(a));

        Node rev=reverse(a);
        display(rev);


    }
    
}
