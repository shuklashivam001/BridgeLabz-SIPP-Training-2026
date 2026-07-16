package dsa.dsa.linked_list;

public class MergeLogStreams {

    static class Node {
        int time;
        Node next;

        Node(int time) {
            this.time = time;
        }
    }

    public static Node mergeLogStreams(Node a, Node b) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.time <= b.time) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }

        return dummy.next;
    }

    public static void display(Node head) {

        while (head != null) {
            System.out.print(head.time + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        a.next = new Node(3);
        a.next.next = new Node(5);

        Node b = new Node(2);
        b.next = new Node(4);
        b.next.next = new Node(6);

        Node merged = mergeLogStreams(a, b);

        display(merged);
    }
}