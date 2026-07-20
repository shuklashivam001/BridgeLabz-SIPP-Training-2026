package dsa.dsa.trees;

public class DeleteFolderTree {

    static class Node {
        String name;
        Node left, right;

        Node(String name) {
            this.name = name;
        }
    }

    static void deleteFolderTree(Node root) {

        if (root == null)
            return;

        deleteFolderTree(root.left);
        deleteFolderTree(root.right);

        System.out.println("Deleted: " + root.name);
    }

    public static void main(String[] args) {

        Node root = new Node("Root");
        root.left = new Node("Folder1");
        root.right = new Node("Folder2");
        root.left.left = new Node("File1");
        root.left.right = new Node("File2");

        deleteFolderTree(root);
    }
}