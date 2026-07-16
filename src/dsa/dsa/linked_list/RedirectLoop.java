package dsa.dsa.linked_list;

public class RedirectLoop {

    static class Node {
        int urlId;
        Node next;

        Node(int urlId) {
            this.urlId = urlId;
        }
    }

    public static boolean hasRedirectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(hasRedirectLoop(head));
    }
}