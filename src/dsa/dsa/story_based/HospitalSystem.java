package dsa.dsa.story_based;

import java.util.*;

public class HospitalSystem {

    static class Patient {
        String name;
        int urgency;

        Patient(String name, int urgency) {
            this.name = name;
            this.urgency = urgency;
        }
    }

    static class TriageQueue {
        PriorityQueue<Patient> queue;

        TriageQueue() {
            queue = new PriorityQueue<>((a, b) -> b.urgency - a.urgency);
        }

        void enqueue(String name, int urgency) {
            queue.offer(new Patient(name, urgency));
        }

        Patient dequeue() {
            if (queue.isEmpty())
                return null;
            return queue.poll();
        }

        Patient peek() {
            if (queue.isEmpty())
                return null;
            return queue.peek();
        }
    }

    static int[] slidingWindowMaximum(int[] vitals, int k) {
        int n = vitals.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!deque.isEmpty() && deque.peekFirst() <= i - k)
                deque.pollFirst();

            while (!deque.isEmpty() && vitals[deque.peekLast()] <= vitals[i])
                deque.pollLast();

            deque.offerLast(i);

            if (i >= k - 1)
                result[i - k + 1] = vitals[deque.peekFirst()];
        }

        return result;
    }

    static class CircularQueue {
        int[] queue;
        int front;
        int rear;
        int size;
        int capacity;

        CircularQueue(int capacity) {
            this.capacity = capacity;
            queue = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        boolean enqueue(int process) {
            if (size == capacity)
                return false;

            rear = (rear + 1) % capacity;
            queue[rear] = process;
            size++;
            return true;
        }

        int dequeue() {
            if (size == 0)
                return -1;

            int value = queue[front];
            front = (front + 1) % capacity;
            size--;
            return value;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("Hospital Triage");

        TriageQueue triage = new TriageQueue();
        triage.enqueue("Patient A", 2);
        triage.enqueue("Patient B", 5);
        triage.enqueue("Patient C", 3);

        while (triage.peek() != null) {
            Patient p = triage.dequeue();
            System.out.println(p.name + " " + p.urgency);
        }

        System.out.println("\nSliding Window Maximum");

        int[] vitals = {98, 102, 99, 105, 101, 110, 108};
        int[] max = slidingWindowMaximum(vitals, 3);

        for (int x : max)
            System.out.print(x + " ");

        System.out.println("\n\nCircular Queue");

        CircularQueue cpu = new CircularQueue(5);

        cpu.enqueue(101);
        cpu.enqueue(102);
        cpu.enqueue(103);

        System.out.println(cpu.dequeue());

        cpu.enqueue(104);
        cpu.enqueue(105);

        while (!cpu.isEmpty()) {
            System.out.print(cpu.dequeue() + " ");
        }
    }
}