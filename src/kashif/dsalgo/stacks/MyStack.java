package kashif.dsalgo.stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {

    private int[] stack;
    private int size;
    private int top;

    public MyStack(int size) {
        this.stack = new int[size];
        this.size = size;
        top = -1;
    }

    private boolean isFull() {
        return top == size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int item) {
        top++;

        if (isFull())
            throw new StackOverflowError();

        stack[top] = item;
    }

    public int pop() {
        if (isEmpty())
            throw new EmptyStackException();

        var removed = stack[top];
        top--;
        return removed;
    }

    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();

        return stack[top];
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
