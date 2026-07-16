package dsa.dsa.linked_list;

public class RemoveTask {

    static class Node {
        int taskId;
        Node next;

        Node(int taskId) {
            this.taskId = taskId;
        }
    }

    public static Node removeTask(Node head, int taskId) {

        if (head == null) {
            return null;
        }

        if (head.taskId == taskId) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    public static void display(Node head) {

        while (head != null) {
            System.out.print(head.taskId + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        head = removeTask(head, 20);

        display(head);
    }
}