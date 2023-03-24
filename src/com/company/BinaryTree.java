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


    public static void LevelOrder(Node root)   //O(n)
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
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }

            }
        }
    }

    public static int Height(Node root)
    {
        if(root==null){
            return 0;
        }

        int lh = Height(root.left);
        int rh = Height(root.right);

        return Math.max(lh, rh)+1;
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }

        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
       return lc+rc+1;
    }

    public static int Sum(Node root){
        if(root==null){
            return 0;
        }

        int lc = Sum(root.left);
        int rc = Sum(root.right);
       return lc+rc+root.data;
    }

    public static int diameterApproach1(Node root)  //O(n^2)
    {
        if(root == null) return 0;

        int leftD = diameterApproach1(root.left);
        int rightD = diameterApproach1(root.right);
        int rightH = Height(root.right);
        int leftH = Height(root.left);

        int selfDiameter = leftH + rightH + 1;

        return Math.max(selfDiameter,Math.max(rightD, leftD));
    }


    
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryT tree = new BinaryT();
        Node root = tree.buildeTree(nodes);
        
        // Preorder(root);

        // Inorder(root);

        // Postorder(root); 

        // LevelOrder(root);

        /*
                    1
                   /  \
                  2    3
                 / \  / \
                4   5 6  7
         */
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3); 
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        // System.out.println(Height(root1));
        System.out.println(countNodes(root1));

        System.out.println(diameterApproach1(root1));
    
}
}
