
public class startOfLoop {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node startOfLoop(Node head)
    {
                
        if(head==null || head.next==null)
        {
            return null;
        }
        Node slow=head;
        Node fast=head;
        
        while(fast!=null)
        {
            if(slow==null) return null;
            slow=slow.next;
            
            if(fast.next==null) return null;
            fast=fast.next.next;
            
            if(slow==fast)
            {
                slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
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
        d.next=a;
        // d.next=e;
        // e.next=f;
        // f.next=null;

        // display(a);
        // System.out.println(detectLoop(a));
        Node res=startOfLoop(a);
        System.out.println(res.data);
        

       
        
    }
    
}
