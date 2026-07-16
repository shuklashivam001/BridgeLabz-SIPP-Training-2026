package dsa.dsa.story_based;

public class TrainManagement {

    static class Node {
        int coachNo;
        Node next;

        Node(int coachNo) {
            this.coachNo = coachNo;
            this.next = null;
        }
    }

    Node head;

    public void addCoach(int coachNo) {

        Node newNode = new Node(coachNo);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void removeCoach(int coachNo) {

        if (head == null) {
            return;
        }

        if (head.coachNo == coachNo) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.coachNo != coachNo) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void reverseTrain() {

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public boolean hasCycle() {

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

    public Node findMiddleCoach() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node mergeSortedSchedules(Node first, Node second) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (first != null && second != null) {

            if (first.coachNo <= second.coachNo) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }

            tail = tail.next;
        }

        if (first != null) {
            tail.next = first;
        }

        if (second != null) {
            tail.next = second;
        }

        return dummy.next;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.coachNo + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void printList(Node head) {

        while (head != null) {
            System.out.print(head.coachNo + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        TrainManagement train = new TrainManagement();

        train.addCoach(1);
        train.addCoach(2);
        train.addCoach(3);
        train.addCoach(4);

        System.out.println("Train:");
        train.display();

        train.removeCoach(2);
        System.out.println("After removing coach 2:");
        train.display();

        train.reverseTrain();
        System.out.println("After reversing:");
        train.display();

        Node middle = train.findMiddleCoach();
        System.out.println("Middle Coach: " + middle.coachNo);

        System.out.println("Cycle Present: " + train.hasCycle());

        TrainManagement t1 = new TrainManagement();
        t1.addCoach(1);
        t1.addCoach(3);
        t1.addCoach(5);

        TrainManagement t2 = new TrainManagement();
        t2.addCoach(2);
        t2.addCoach(4);
        t2.addCoach(6);

        Node merged = mergeSortedSchedules(t1.head, t2.head);

        System.out.println("Merged Schedule:");
        printList(merged);
    }
}