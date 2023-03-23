import java.util.*;
import java.util.LinkedList;

public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryT{
        static int index = -1;
        public static Node buildeTree(int nodes[])
        {
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildeTree(nodes); 
            newNode.right = buildeTree(nodes);
            return newNode;
        }
    }
    
    public static void Preorder(Node root)  //O(n)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);

    }

    public static void Inorder(Node root)  //O(n)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.println(root.data+" ");
        Inorder(root.right);

    }

    public static void Postorder(Node root)  //O(n)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        Inorder(root.right);
        System.out.println(root.data+" ");
    }


    public static LevelOrder(Node root)
    {
        if(root==null)
        {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null)
                }
            }else{
                System.out.println(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
        }
    }
    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryT tree = new BinaryT();
        Node root = tree.buildeTree(nodes);
        
        Preorder(root);

        Inorder(root);

        Postorder(root); 
    }
    
}
