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

    int countNodes(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countNodes(node.left) + countNodes(node.right);
        }
    }
    boolean search(Node root,int k){
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;
        }
        return search(root.left, k) || search(root.right, k); 
    }
    void printLevel(Node root,int k){
        if(root==null){
            return;
        }
        if(k==1){
            System.out.print(root.data+" ");
        }else{
            printLevel(root.left, k-1);
            printLevel(root.right, k-1);
        }
    }
    int maxValue(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int leftMax = maxValue(root.left);
        int rightMax = maxValue(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
    int leafNodes(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return leafNodes(root.left)+leafNodes(root.right);
    }
    int sumNodes(Node root){
        if(root==null) return 0;
        return sumNodes(root.left) + sumNodes(root.right) + root.data;  
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(13);
        tree.root.right.right.left = new Node(14);
        tree.root.right.right.right = new Node(15);

        int nodeCount = tree.countNodes(tree.root);
        System.out.println("Number of nodes: " + nodeCount);

        System.out.println("Is 20 present in the tree? " + tree.search(tree.root, 20));

        tree.printLevel(tree.root, 2);

        System.out.println("\nMaximum value in the tree: " + tree.maxValue(tree.root));

        System.out.println("Number of leaf nodes: " + tree.leafNodes(tree.root));

        System.out.println("Sum of all nodes: " + tree.sumNodes(tree.root));

        tree.preOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        
}
}
