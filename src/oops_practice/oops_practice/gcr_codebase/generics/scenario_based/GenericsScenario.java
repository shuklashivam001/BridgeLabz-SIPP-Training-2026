package oops_practice.oops_practice.gcr_codebase.generics.scenario_based;

import java.util.*;

// Generic Pair Class
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

// Generic Stack Class
class GenericStack<T> {
    private List<T> elements;

    public GenericStack() {
        elements = new ArrayList<>();
    }

    public void push(T item) {
        elements.add(item);
    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

// Generic Repository Class
class GenericRepository<T> {
    private List<T> records;

    public GenericRepository() {
        records = new ArrayList<>();
    }

    public void add(T item) {
        records.add(item);
    }

    public List<T> getAll() {
        return records;
    }
}

// Sample Entity Class
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

// Utility Class
class GenericUtility {

    // Generic Method with Bounded Type
    public static <T extends Comparable<T>> T findMaximum(T[] array) {

        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];

        for (T value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    // Wildcard Method
    public static void printElements(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}

// Main Class
public class GenericsScenario {

    public static void main(String[] args) {

        // Pair Demonstration
        Pair<String, Integer> studentInfo = new Pair<>("Age", 21);
        System.out.println("Pair Object: " + studentInfo);

        // Generic Stack Demonstration
        GenericStack<Integer> stack = new GenericStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\nStack Operations");
        System.out.println("Top Element : " + stack.peek());
        System.out.println("Removed Element : " + stack.pop());
        System.out.println("Current Top : " + stack.peek());

        // Generic Method Demonstration
        Integer[] numbers = {15, 80, 42, 99, 56};
        System.out.println("\nMaximum Integer: "
                + GenericUtility.findMaximum(numbers));

        String[] names = {"Amit", "Rahul", "Zoya", "Kiran"};
        System.out.println("Maximum String: "
                + GenericUtility.findMaximum(names));

        // Generic Repository Demonstration
        GenericRepository<Student> repository = new GenericRepository<>();

        repository.add(new Student(101, "Rahul"));
        repository.add(new Student(102, "Priya"));
        repository.add(new Student(103, "Aman"));

        System.out.println("\nStudents Stored in Repository:");
        GenericUtility.printElements(repository.getAll());

        // Wildcard Demonstration
        List<Double> marks = Arrays.asList(88.5, 91.0, 76.5);

        System.out.println("\nMarks:");
        GenericUtility.printElements(marks);
    }
}