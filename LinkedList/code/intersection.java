package code;
public class intersection {

    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node intersection(Node head1,Node head2)
    {
        int count1=0,count2=0;
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null)
        {
            count1++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            count2++;
            temp2=temp2.next;
        }


        if(count1>=count2){
            temp1=head1;
            temp2=head2;
        }
        else{
            temp1=head2;
            temp2=head1;
        }
        for(int i=1;i<=Math.abs(count1-count2);i++)
        {
            temp1=temp1.next;
        }

        while(temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;

    }

    public static void main(String[] args) {
        Node a=new Node(87);
        Node b=new Node(100);
        Node c=new Node(13);
        Node d=new Node(4);
        Node e=new Node(1);
        Node f=new Node(12);
        Node g=new Node(10);
        //-----------------------
        Node h=new Node(90);
        Node i=new Node(9);
        Node j=new Node(20);

        a.next=b;
        b.next=c;
        c.next=d;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=null;
        h.next=i;
        i.next=j;
        j.next=f;

        Node result=intersection(a, h);
        System.out.println(result.data);


    }
    
}
