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
    public static int size;

    //methods -> toAdd() {add First, add Last }, remove(), print(), search()

    public void addFirst(int data)
    {
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        //newNode head points to head
        newNode.next = head; //link
        //head value become newNode
        head = newNode; 
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addAtIndex(int index, int data)
    {
        if(index==0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }
        //i=index-1
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++)
        {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail=prev;
        size--;
        return val;
    }

    public void itrSearch(int key) //iterative
    {
        Node temp = head;
        // int i=0;
        while(temp != null)
        {
            if(temp.data == key){
                System.out.println(key + " is Present");
                return;
            }
            temp = temp.next;
        }
        System.out.println(key + " is Not Present");
    }

    //recursive search
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx==-10){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key) //recursive
    {
        return helper(head,key);
        
    }


    //Q2 Find and remove Nth node from End




    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //add
        ll.addFirst(1);
        ll.addFirst(3); 
        ll.addLast(4);
        ll.addAtIndex(2,9);
        ll.print();

        //size
        // System.out.println(ll.size);

        //remove
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();

        //search
        // ll.itrSearch(9);
    }
    
}
