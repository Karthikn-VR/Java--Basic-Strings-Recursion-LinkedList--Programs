import java.util.Scanner;

public class BinarySearchTree {
    static Node root = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        
        inorder(root);
    }


    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

  
    static Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }

        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if (val > node.data) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    
    static void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
}
