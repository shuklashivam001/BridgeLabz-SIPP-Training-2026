package dsa.dsa.stacks;

public class UndoBuffer {

    private String[] data;
    private int top;

    public UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    public boolean push(String edit) {
        if (top == data.length - 1)
            return false;
        data[++top] = edit;
        return true;
    }

    public String pop() {
        if (isEmpty())
            throw new RuntimeException("Nothing to undo");
        return data[top--];
    }

    public String peek() {
        if (isEmpty())
            throw new RuntimeException("Undo buffer is empty");
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        UndoBuffer buffer = new UndoBuffer(3);

        buffer.push("Type A");
        buffer.push("Type B");
        buffer.push("Type C");

        System.out.println(buffer.peek());
        System.out.println(buffer.pop());
        System.out.println(buffer.pop());
    }
}