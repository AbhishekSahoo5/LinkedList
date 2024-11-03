import java.util.*;
public class _01_CollectionLL {

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();

        list.addFirst("Sahoo");
        list.addFirst("Abhishek");
        list.addFirst("The");
        list.addFirst("Presenting");

        System.out.println(list);

        list.add("The");
        list.addLast("Web");
        list.add("Developer");
        
        System.out.println(list);

        System.out.println("Size= "+list.size());


        //Iteration
        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.println(list.get(i));
        // }

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
    
}
