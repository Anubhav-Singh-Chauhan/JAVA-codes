public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public  Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }

    public static Node head;
    public static Node tail;

    //methods -> toAdd() {add First, add Last }, remove(), print(), search()

    public void addFirst(int data)
    {
        //create new node
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        
        //newNode head points to head
        newNode.next = head; //link
        //head value become newNode
        head = newNode;
         
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(3);
    }
    
}
