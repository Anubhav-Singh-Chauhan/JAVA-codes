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
}
