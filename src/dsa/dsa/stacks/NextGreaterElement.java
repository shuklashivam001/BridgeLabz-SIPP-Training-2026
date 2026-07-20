package dsa.dsa.stacks;

import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextBusierDay(int[] visitors) {
        int n = visitors.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {
                answer[stack.pop()] = visitors[i];
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] visitors = {100, 80, 120, 90, 150};

        int[] ans = nextBusierDay(visitors);

        for (int x : ans)
            System.out.print(x + " ");
    }
}