package dsa.dsa.story_based;

import java.util.*;

public class StackApplication {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static int[] nextGreaterPrice(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                ans[i] = -1;
            else
                ans[i] = stack.peek();

            stack.push(prices[i]);
        }

        return ans;
    }

    public static int[] stockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty())
                span[i] = i + 1;
            else
                span[i] = i - stack.peek();

            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {

        // Balanced Brackets
        String code = "{[(a+b)*(c+d)]}";
        System.out.println("Balanced Brackets: " + isBalanced(code));

        // Stock Prices
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        // Next Greater Price
        int[] next = nextGreaterPrice(prices);
        System.out.println("\nNext Greater Price:");
        for (int x : next) {
            System.out.print(x + " ");
        }

        // Stock Span
        int[] span = stockSpan(prices);
        System.out.println("\n\nStock Span:");
        for (int x : span) {
            System.out.print(x + " ");
        }
    }
}