package kashif.dsalgo.queues;

import java.util.ArrayList;
import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> theStack;
    private Stack<Integer> reverseStack;

    public QueueUsingStack() {
        theStack = new Stack<>();
        reverseStack = new Stack<>();
    }

    public void enqueue(int item) {
        theStack.push(item);
    }

    public int dequeue() {
        var tempStack = theStack;

        while (!tempStack.empty()) {
            reverseStack.push(tempStack.pop());
        }

        var removed = reverseStack.pop();

        while (!reverseStack.empty()) {
            theStack.push(reverseStack.pop());
        }

        return removed;
    }

}
