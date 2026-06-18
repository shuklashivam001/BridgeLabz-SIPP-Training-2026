package core_java_practice.core_java_practice.gcr_codebase.exception_handling;

import java.util.*;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        try {
            System.out.println(
                    "Value at index " + index +
                            ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}