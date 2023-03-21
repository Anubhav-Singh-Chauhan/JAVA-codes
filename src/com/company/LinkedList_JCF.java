import java.util.LinkedList;
public class LinkedList_JCF {
    public static void main(String[] args) {
        //create
        LinkedList <Integer> list = new LinkedList<>();

        //add
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        System.out.println(list);

        //remove
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
    }
    
}
