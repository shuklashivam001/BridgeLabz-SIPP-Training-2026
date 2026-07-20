package dsa.dsa.story_based;

public class DictionaryBST {

    static class Node {
        String word;
        Node left, right;

        Node(String word) {
            this.word = word;
        }
    }

    static Node root;

    static Node insert(Node root, String word) {
        if (root == null)
            return new Node(word);

        if (word.compareTo(root.word) < 0)
            root.left = insert(root.left, word);
        else if (word.compareTo(root.word) > 0)
            root.right = insert(root.right, word);

        return root;
    }

    static boolean search(Node root, String word) {
        if (root == null)
            return false;

        if (word.equals(root.word))
            return true;

        if (word.compareTo(root.word) < 0)
            return search(root.left, word);

        return search(root.right, word);
    }

    static Node delete(Node root, String word) {

        if (root == null)
            return null;

        if (word.compareTo(root.word) < 0) {
            root.left = delete(root.left, word);
        } else if (word.compareTo(root.word) > 0) {
            root.right = delete(root.right, word);
        } else {

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            Node temp = minValue(root.right);
            root.word = temp.word;
            root.right = delete(root.right, temp.word);
        }

        return root;
    }

    static Node minValue(Node root) {
        while (root.left != null)
            root = root.left;

        return root;
    }

    static int count = 0;
    static String kthWord = "";

    static void kthSmallest(Node root, int k) {
        if (root == null)
            return;

        kthSmallest(root.left, k);

        count++;
        if (count == k) {
            kthWord = root.word;
            return;
        }

        kthSmallest(root.right, k);
    }

    static boolean isValidBST(Node root) {
        return validate(root, null, null);
    }

    static boolean validate(Node root, String min, String max) {

        if (root == null)
            return true;

        if (min != null && root.word.compareTo(min) <= 0)
            return false;

        if (max != null && root.word.compareTo(max) >= 0)
            return false;

        return validate(root.left, min, root.word) &&
                validate(root.right, root.word, max);
    }

    static Node lca(Node root, String a, String b) {

        if (root == null)
            return null;

        if (a.compareTo(root.word) < 0 && b.compareTo(root.word) < 0)
            return lca(root.left, a, b);

        if (a.compareTo(root.word) > 0 && b.compareTo(root.word) > 0)
            return lca(root.right, a, b);

        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.word + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        String[] words = {
                "mango", "apple", "banana", "orange", "grape",
                "kiwi", "pear", "peach", "plum", "melon",
                "cherry", "fig", "guava", "lemon", "lime",
                "papaya", "berry", "apricot", "coconut", "date"
        };

        for (String word : words)
            root = insert(root, word);

        System.out.println("Dictionary (Inorder):");
        inorder(root);

        System.out.println("\n\nSearch apple: " + search(root, "apple"));
        System.out.println("Search tomato: " + search(root, "tomato"));

        root = delete(root, "date");
        root = delete(root, "fig");
        root = delete(root, "mango");

        System.out.println("\nAfter Deletion:");
        inorder(root);

        count = 0;
        kthWord = "";
        kthSmallest(root, 5);
        System.out.println("\n\n5th Alphabetical Word: " + kthWord);

        System.out.println("Valid BST: " + isValidBST(root));

        Node ancestor = lca(root, "banana", "lime");
        if (ancestor != null)
            System.out.println("LCA of banana and lime: " + ancestor.word);
    }
}