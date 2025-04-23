class Node {
    int data;
    Node left, right;

    Node(int item){
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;
    void preOrder(Node root) {
        if (root == null) return; 
        System.out.print(root.data + " "); 
        preOrder(root.left); 
        preOrder(root.right); 
    }
    void postOrder(Node root){
        if (root == null) return; 
        preOrder(root.left); 
        preOrder(root.right); 
        System.out.print(root.data + " "); 
    }
