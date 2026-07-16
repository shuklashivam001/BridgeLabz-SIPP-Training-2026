package dsa.dsa.linked_list;

public class FindMiddle {

    static class Node {
        int serverId;
        Node next;

        Node(int serverId) {
            this.serverId = serverId;
        }
    }

    public static Node findMiddleServer(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middle = findMiddleServer(head);

        System.out.println("Middle Server: " + middle.serverId);
    }
}