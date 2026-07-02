package oops_practice.oops_practice.gcr_codebase.generics.story_based;

import java.util.*;

// Generic Pair Class
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public void display() {
        System.out.println("First : " + first);
        System.out.println("Second : " + second);
    }
}

// Generic Stack Class
class GenericStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }
}

// Generic Repository Class
class Repository<T> {
    private ArrayList<T> records = new ArrayList<>();

    public void add(T item) {
        records.add(item);
    }

    public void displayRecords() {
        for (T item : records) {
            System.out.println(item);
        }
    }
}

// Generic Methods Class
class GenericOperations {

    // Generic method bounded to Comparable
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }

    // Wildcard method
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}

// Driver Class
public class GenericDemo {
    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> student = new Pair<>("Shivam", 22);
        student.display();

        // Stack
        GenericStack<Integer> numberStack = new GenericStack<>();
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);

        System.out.println("Popped Element: " + numberStack.pop());

        // findMax
        Integer[] marks = {65, 82, 91, 74, 88};
        System.out.println("Maximum Marks: " + GenericOperations.findMax(marks));

        // Repository
        Repository<String> studentRepository = new Repository<>();
        studentRepository.add("Aman");
        studentRepository.add("Rahul");
        studentRepository.add("Priya");

        System.out.println("Repository Data:");
        studentRepository.displayRecords();

        // Wildcard Method
        List<String> subjects = Arrays.asList("Java", "Python", "DBMS");

        System.out.println("Subjects:");
        GenericOperations.printList(subjects);
    }
}