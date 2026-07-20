package dsa.dsa.trees;

public class TreeDiameter {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static int diameter = 0;

    static int height(Node root) {

        if (root == null)
            return -1;

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right + 2);

        return Math.max(left, right) + 1;
    }

    static int longestCommunicationPath(Node root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(longestCommunicationPath(root));
    }
}