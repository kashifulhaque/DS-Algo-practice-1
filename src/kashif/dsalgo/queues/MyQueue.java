package kashif.dsalgo.queues;

import java.util.Arrays;

public class MyQueue {

    private int[] queue;
    private int count;
    private int front;
    private int rear;

    public MyQueue(int size) {
        queue = new int[size];
        front = rear = 0;
        count = 0;
    }

    public boolean isFull() {
        return count == queue.length;
    }

    public boolean isEmpty() {
        return front == 0 && rear == 0;
    }

    public void enqueue(int item) {
        if (isFull())
            throw new IllegalStateException();

        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        count--;
        var removed = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        return removed;
    }

    public int peek() {
        return queue[front];
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
