class LL{
    Node head;
    private int size;

    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //Insert--first   
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Insert--last
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        
    }

    //print
    public void print()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null"+" || size="+size);
        System.out.println();
    }

    //Delete--first
    public void deleteFirst(){
        if(head==null)
        {
            return;
        }
        head=head.next;
        size--;
    }

    //Delete--last
    public void deleteLast()
    {
        if(head==null){
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    //reverse
    public void reverseIterate(){
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
        }
    }



}

public class _01_implementation{

    public static void main(String[] args) {
        LL list=new LL();

        //addFirst
        list.addFirst("d");
        list.addFirst("c");
        list.addFirst("b");
        list.addFirst("a");

        //addLast
        list.addLast("e");
        list.addLast("f");
        list.print();


        //deleteFirst
        list.deleteFirst();
        list.print();


        //deleteFirst
        list.deleteLast();
        list.print();






        System.out.println();

    }
}