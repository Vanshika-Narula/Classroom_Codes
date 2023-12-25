package Trees_YT1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// User input : 2 4 7 -1 -1 -1 1 8 -1 -1 3 -1 -1
//                2
//              /  \
//             4    1
//            /    / \
//           7    8   3


// inorder / preorder / postorder / level order / height of the tree / size of the tree / maximum of the tree
public class tree{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.println();
        levelOrder(root);
        System.out.println();

        int ht = height(root);
        System.out.println("Height of the tree: "+ ht);

        int siz = size(root);
        System.out.println("Size of the tree: "+ siz);

        int max = maximum(root);
        System.out.println("Maximum of the tree: "+ max);

    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if(data==-1)
            return null;
        
        root = new Node(data);
        System.out.println("Enter left for: "+ data);
        root.left = createTree();

        System.out.println("Enter right for: "+ data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root) {
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    static void preOrder(Node root) {
        if(root==null)
            return;
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr==null) {
                if(q.isEmpty())
                    return;
                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }

    static int height(Node root) {
        if(root==null)
            return 0;
        return Math.max(height(root.left), height(root.right))+1;
    }

    static int size(Node root) {
        if(root==null)
            return 0;
        return size(root.left)+size(root.right)+1;
    }

    static int maximum(Node root) {
        if(root == null) 
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }
}

class Node{
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}