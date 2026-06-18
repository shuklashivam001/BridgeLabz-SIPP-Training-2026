package core_java_practice.core_java_practice.gcr_codebase.recursion.story_based;

public class RecursivePrograms {

    // 1. Tower of Hanoi
    static int moveCount = 0;

    static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }

    // 2. Recursive Binary Search
    static int binarySearch(int[] arr, int low, int high, int key) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;
        else if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key);
        else
            return binarySearch(arr, mid + 1, high, key);
    }

    // 3. Sum of Digits
    static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumOfDigits(n / 10);
    }

    // 4. Reverse a String
    static String reverseString(String str) {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // 5. Balanced Parentheses without Stack
    static boolean isBalanced(String str, int index, int count) {
        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        if (str.charAt(index) == '(')
            return isBalanced(str, index + 1, count + 1);
        else if (str.charAt(index) == ')')
            return isBalanced(str, index + 1, count - 1);
        else
            return isBalanced(str, index + 1, count);
    }

    public static void main(String[] args) {

        // Tower of Hanoi
        int n = 3;
        System.out.println("Tower of Hanoi:");
        towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moveCount);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500};
        int key = 300;
        int result = binarySearch(prices, 0, prices.length - 1, key);
        System.out.println("\nBinary Search Result: " + result);

        // Sum of Digits
        int number = 12345;
        System.out.println("Sum of Digits = " + sumOfDigits(number));

        // Reverse String
        String str = "HELLO";
        System.out.println("Reversed String = " + reverseString(str));

        // Balanced Parentheses
        String exp = "((()))";
        System.out.println("Balanced? " + isBalanced(exp, 0, 0));
    }
}