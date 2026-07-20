package dsa.dsa.trees;

import java.util.*;

public class IterativePreorder {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            result.add(current.val);

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(preorder(root));
    }
}