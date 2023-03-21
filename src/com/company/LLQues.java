public class LLQues {

    // Q1 Reverse a Linked List


    /*
     * 
     * public void reverse()
     * {
     * Node prev = null;
     * Node curr = tail = head;
     * Node next;
     * 
     * while(curr!=null)
     * {
     * next=curr.next;
     * curr.next = prev;
     * prev = curr;
     * curr = next;
     * }
     * head = prev;
     * }
     * 
     */



    // Q2 Find and remove Nth node from End


    /*
     * public void deleteNthFromEnd(int n)
     * {
     * int Size = 0;
     * Node temp = head;
     * while(temp!=null)
     * {
     * temp = temp.next;
     * Size++;
     * }
     * 
     * if(n==Size)
     * {
     * head = head.next;
     * return;
     * }
     * int i=1;
     * int iToFind = Size - n;
     * Node prev = head;
     * while(i<iToFind)
     * {
     * prev = prev.next;
     * i++;
     * }
     * prev.next = prev.next.next;
     * return;
     * }
     */



    // Q3 check LL is plaindrome or not


    /*
     * public Node findMid(Node head)
     * {
     * Node slow = head;
     * Node fast = head;
     * 
     * while(fast != null && fast.next!=null)
     * {
     * slow = slow.next;
     * fast = fast.next.next;
     * }
     * return slow;
     * }
     * 
     * public boolean isPalindrome()
     * {
     * if(head==null || head.next==null){
     * return true;
     * }
     * //find mid
     * Node mid = findMid(head);
     * 
     * //reverse 2nd half
     * Node prev = null;
     * Node curr = mid;
     * Node next;
     * while(curr!=null)
     * {
     * next = curr.next;
     * curr.next = prev;
     * prev = curr;
     * curr = next;
     * }
     * Node right = prev;
     * Node left = head;
     * 
     * //check left half == right half
     * 
     * while(right != null )
     * {
     * if(left.data != right.data){
     * return false;
     * }
     * left = left.next;
     * right = right.next;
     * }
     * 
     * return true;
     * }
     */



    // Q4 Detect a cycle/Loop in a LL {Floyd's Cycle Finding Algorithm}

    
    /*
     * public boolean isCycle()
     * {
     * Node slow = head, fast = head;
     * while(fast!=null && fast.next!=null)
     * {
     * slow = slow.next;
     * fast = fast.next.next;
     * 
     * if(slow == fast){
     * return true;
     * }
     * }
     * return false;
     * }
     */




    // Q5 Removing Cycle from LL


    /*
     * 
     * 
     * public static boolean RemoveCycle()
     * {
     * Node slow = head, fast = head;
     * boolean cycle = false;
     * while(fast!=null && fast.next!=null)
     * {
     * slow = slow.next;
     * fast = fast.next.next;
     * 
     * if(slow == fast){
     * cycle = true;
     * break;
     * }
     * }
     * 
     * if(cycle==false)
     * {
     * return false;
     * }
     * Node prev = null;
     * slow = head;
     * while(slow!=fast)
     * {
     * prev = slow;
     * slow = slow.next;
     * fast = fast.next;
     * }
     * 
     * prev.next=null;
     * System.out.println("Cycle Removed");
     * return true;
     * 
     * }
     */


     // Q6 Mergesort in a Linked List
     /*
      public Node findMid()
    {
        Node left = head;
        Node right = head.next;
        while(right!=null && right.next!=null)
        {
            right = right.next;
            left = left.next;
        }
        return left;
    }
    public Node merge(Node l1, Node l2)
    {
        Node mergeNode = new Node(-1);
        Node temp = mergeNode;
        while(l1!=null && l2!=null)
        {
            if(l1.data <= l2.data){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        while(l1!=null)
        {
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }

        while(l2!=null)
        {
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }

        return mergeNode.next;
    }

    public Node mergeSort(Node head)
    {
        if(head == null || head.next==null)
        {
            return head;
        }

        //find Mid
        Node mid = findMid();

        Node rightHead = mid.next;
        mid.next = null;
        Node newRight = mergeSort(rightHead);
        Node newLeft = mergeSort(head);
        return merge(newLeft,newRight);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //add
        ll.addFirst(1);
        ll.addFirst(3); 
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(2);

        // ll.addAtIndex(2,9);
        ll.print();
        ll.head = ll.mergeSort(head);

        // //size
        // System.out.println(size);

        //remove
        // ll.removeFirst();
        ll.print();
        // ll.removeLast();
        // ll.print();

        //search
        // ll.itrSearch(9);
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // RemoveCycle();
        // System.out.println(RemoveCycle());

    }
      */
}
