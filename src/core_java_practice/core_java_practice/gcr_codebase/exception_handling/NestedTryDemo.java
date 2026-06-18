package core_java_practice.core_java_practice.gcr_codebase.exception_handling;

public class NestedTryDemo {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int index = 2;
        int divisor = 0;

        try {
            try {
                int value = arr[index];

                try {
                    System.out.println(
                            value / divisor);
                }
                catch (ArithmeticException e) {
                    System.out.println(
                            "Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(
                        "Invalid array index!");
            }

        } catch (Exception e) {
            System.out.println(
                    "Some error occurred");
        }
    }
}