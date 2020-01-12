package kashif.dsalgo.queues;

import kashif.dsalgo.stacks.MyStack;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public void reverse(Queue<Integer> queue) {
        MyStack stack = new MyStack(queue.size());

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println(queue);
    }

}
