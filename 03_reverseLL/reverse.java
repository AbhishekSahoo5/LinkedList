import java.util.*;

public class reverse {

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {

        for(int i=0;i<list.size()/2;i++)
        {
            Integer temp=list.get(i);
            list.set(i, list.get(list.size()-i-1));
            list.set(list.size()-i-1,temp);
        }
        return list;
        
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);


        LinkedList<Integer> res=reverse(ll);
        System.out.println(res);
    }
    
}
