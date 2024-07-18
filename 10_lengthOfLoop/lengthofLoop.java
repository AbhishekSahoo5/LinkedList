
public class lengthofLoop {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static int lengthLoop(Node head)
    {
                
        if(head==null || head.next==null)
        {
            return 0;
        }
        Node slow=head;
        Node fast=head;
        
        while(fast!=null)
        {
            if(slow==null) return 0;
            slow=slow.next;
            
            if(fast.next==null) return 0;
            fast=fast.next.next;
            
            if(slow==fast)
            {
                //Now fast and slow both ar at same point
                int count=1;
                fast=fast.next;      //move fast forward bhy one
                while(fast!=slow)
                {
                    count++;
                    fast=fast.next;
                }
                return count;
            }
        }
        return 0;
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
        System.out.println(lengthLoop(a));
        

       
        
    }
    
}
