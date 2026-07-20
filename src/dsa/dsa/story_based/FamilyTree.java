package dsa.dsa.story_based;

import java.util.*;

public class FamilyTree {

    static class Node {
        String name;
        Node left, right;

        Node(String name) {
            this.name = name;
        }
    }

    static void preorderRecursive(Node root) {
        if (root == null) return;
        System.out.print(root.name + " ");
        preorderRecursive(root.left);
        preorderRecursive(root.right);
    }

    static void inorderRecursive(Node root) {
        if (root == null) return;
        inorderRecursive(root.left);
        System.out.print(root.name + " ");
        inorderRecursive(root.right);
    }

    static void postorderRecursive(Node root) {
        if (root == null) return;
        postorderRecursive(root.left);
        postorderRecursive(root.right);
        System.out.print(root.name + " ");
    }

    static void preorderIterative(Node root) {
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.name + " ");

            if (current.right != null)
                stack.push(current.right);

            if (current.left != null)
                stack.push(current.left);
        }
    }

    static void inorderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.name + " ");
            current = current.right;
        }
    }

    static void postorderIterative(Node root) {
        if (root == null) return;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty()) {
            Node current = s1.pop();
            s2.push(current);

            if (current.left != null)
                s1.push(current.left);

            if (current.right != null)
                s1.push(current.right);
        }

        while (!s2.isEmpty())
            System.out.print(s2.pop().name + " ");
    }

    static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.name + " ");

            if (current.left != null)
                queue.offer(current.left);

            if (current.right != null)
                queue.offer(current.right);
        }
    }

    static int height(Node root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    static void nodesAtEachLevel(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            System.out.print("Level " + level + ": " + size + " nodes\n");

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();

                if (current.left != null)
                    queue.offer(current.left);

                if (current.right != null)
                    queue.offer(current.right);
            }

            level++;
        }
    }

    static int diameter = 0;

    static int diameterHelper(Node root) {
        if (root == null)
            return 0;

        int left = diameterHelper(root.left);
        int right = diameterHelper(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }

    static int getDiameter(Node root) {
        diameter = 0;
        diameterHelper(root);
        return diameter;
    }

    static boolean isBalanced(Node root) {
        return check(root) != -1;
    }

    static int check(Node root) {
        if (root == null)
            return 0;

        int left = check(root.left);
        int right = check(root.right);

        if (left == -1 || right == -1)
            return -1;

        if (Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {

        Node root = new Node("Grandparent");
        root.left = new Node("Parent1");
        root.right = new Node("Parent2");
        root.left.left = new Node("Child1");
        root.left.right = new Node("Child2");
        root.right.right = new Node("Child3");

        System.out.println("Preorder Recursive");
        preorderRecursive(root);

        System.out.println("\nInorder Recursive");
        inorderRecursive(root);

        System.out.println("\nPostorder Recursive");
        postorderRecursive(root);

        System.out.println("\nPreorder Iterative");
        preorderIterative(root);

        System.out.println("\nInorder Iterative");
        inorderIterative(root);

        System.out.println("\nPostorder Iterative");
        postorderIterative(root);

        System.out.println("\nLevel Order");
        levelOrder(root);

        System.out.println("\n\nHeight: " + height(root));

        System.out.println("\nNodes at Each Level");
        nodesAtEachLevel(root);

        System.out.println("\nDiameter: " + getDiameter(root));

        System.out.println("Balanced: " + isBalanced(root));
    }
}