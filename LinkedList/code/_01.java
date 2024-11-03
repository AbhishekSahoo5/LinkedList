package code;

public class _01{


    public static class Node{
        int data;        //value
        Node next;       //address of next Node

        Node(int data){
            this.data=data;
        }
    }

    //DISPLAY THE LINKED LIST
    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    //DISPLY THE LINKED LIST RECURSIVELY
    public static void displayR(Node head)
    {
        if(head==null) return;
        System.out.print(head.data+" ");
        displayR(head.next);
    }

    //DISPLAY LINKED LIST REVERSE
    public static void displayRev(Node head)
    {
        if(head==null) return;
        displayRev(head.next);
        System.out.print(head.data+" ");

    }

    // FIND LENGTH OF THE LINKED LIST
    public static int length(Node head)
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;

        //Insert at Begining
        public void insertAtEnd(int data)        //O(1)
        {
            Node newNode=new Node(data);
            size++;
            // For Empty Case
            if(head==null)
            {
                head=newNode;
            }
            //For Non-Empty Case
            else
            {
                tail.next=newNode;
            }
            tail=newNode;
        }

        public void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("Null");
        }
        // public int size()     //O(n)
        // {
        //     int count=0;
        //     Node temp=head;
        //     while(temp!=null)
        //     {
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }


        //Insert at Begining
        public void insertAtBeg(int data)       //O(n)
        {
            Node newNode=new Node(data);
            size++;
            if(head==null)
            {
                head=newNode;
                tail=newNode;
                //insertAtEnd(data);
            }
            else{
                newNode.next=head;
                head=newNode;
            }
        }

        //Insert at any given index
        public void insertAny(int data, int index)      //O(n)
        {
            Node newNode=new Node(data);
            size++;
            if(index==0)
            {
                insertAtBeg(data);
                return;
            }
            else if(index==size)
            {
                insertAtEnd(data);
                return;
            }
            else if(index<0 || index>size)
            {
                System.out.println("Wrong Index");
            }
            else{
                Node temp=head;
                for(int i=0;i<index-1;i++)
                {
                    temp=temp.next;
                }
                newNode.next=temp.next;
                temp.next=newNode;
            }

        }
        //get Element at any index
        public int getElement(int index){      //O(n)
            if(index<0)
            {
                return -1;
            }
            Node temp=head;
            for(int i=0;i<index;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }


        public void delete(int index)
        {
                Node temp=head;
                for(int i=0;i<index-1;i++)
                {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                tail=temp;
                size--;
            
        }
        public static void deleteNthNodefromEnd(Node head,int n)
        {
            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++)
            {
                fast=fast.next;
            }
            while(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
        
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.display();
        System.out.println(ll.size);
        ll.insertAtEnd(100);
        ll.display();
        System.out.println(ll.size);

        ll.insertAtBeg(3);
        ll.insertAtBeg(2);
        ll.insertAtBeg(1);
        ll.display();
        System.out.println(ll.size);
        ll.insertAny(200,3);
        ll.insertAny(300, ll.size);
        ll.display();
        System.out.println(ll.tail.data);
        ll.insertAny(000,0);
        ll.display();

        System.out.println(ll.getElement(-4));
        System.out.println(ll.getElement(4));

        ll.delete(0);
        ll.display();
        ll.delete(3);
        ll.display();

        System.out.println("--------------------------------------");

        LinkedList lm=new LinkedList();
        lm.insertAtEnd(100);
        lm.insertAtEnd(13);
        lm.insertAtEnd(4);
        lm.insertAtEnd(5);
        lm.insertAtEnd(12);
        lm.insertAtEnd(10);

        lm.display();

        lm.deleteNthNodefromEnd(lm.head,1);
        lm.display();
































































        // Node x=new Node();
        // System.out.println(x.data);       //0
        // System.out.println(x);
        // System.out.println(x.next);      //null

        /* 
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);

        // 5  3  9  8  16

        a.next=b;      // 5 -> 3  9  8  16
        b.next=c;      // 5 -> 3 -> 9  8  16
        c.next=d;      // 5 -> 3 -> 9 -> 8  16
        d.next=e;      // 5 -> 3 -> 9 -> 8 -> 16



        System.out.println(a.next);    //_01$Node@3fee733d
        System.out.println(b.data);
        System.out.println(a.next.data);

        System.err.println("--------------------------------");

       display(a);
       System.out.println();
       displayR(a);
       System.out.println();
       displayRev(a);
       System.out.println();
       System.out.println(length(a));

       */


    }
}