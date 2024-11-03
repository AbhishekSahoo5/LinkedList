import java.util.*;

class Linked_List{
    
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    public void nthNodeFromLast(LinkedList<Integer> list,int n)
    {
        System.out.println(list.size());
    }
    
}
public class _01_approach01 {
    
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        Linked_List res=new Linked_List();
        

    }
}




//https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/