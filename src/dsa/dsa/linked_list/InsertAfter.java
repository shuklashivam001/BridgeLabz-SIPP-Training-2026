package dsa.dsa.linked_list;

public class InsertAfter {

    static class Node {
        int trackId;
        Node next;

        Node(int trackId) {
            this.trackId = trackId;
        }
    }

    public static void insertAfter(Node current, int trackId) {

        if (current == null) {
            return;
        }

        Node newNode = new Node(trackId);
        newNode.next = current.next;
        current.next = newNode;
    }

    public static void display(Node head) {

        while (head != null) {
            System.out.print(head.trackId + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);

        insertAfter(head.next, 3);

        display(head);
    }
}