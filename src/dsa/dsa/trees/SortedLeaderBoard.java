package dsa.dsa.trees;

import java.util.*;

public class SortedLeaderBoard {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static void inorder(Node root, List<Integer> result) {
        if (root == null)
            return;

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

    static List<Integer> getSortedLeaderboard(Node root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);

        System.out.println(getSortedLeaderboard(root));
    }
}