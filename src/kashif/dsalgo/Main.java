package kashif.dsalgo;

import kashif.dsalgo.hashmaps.MyHashTable;

// This is my implementation
public class Main {

    public static void main(String[] args) {
        MyHashTable hashTable = new MyHashTable();

        hashTable.put(6, "A");
        hashTable.put(8, "B");
        hashTable.put(11, "C");

        hashTable.put(6, "Changed value");

        hashTable.remove(6);

        System.out.println(hashTable.get(6));
    }

//    private void nonRepeatingUsingSet() {
//        NonRepeatingCharUsingSet charUsingSet = new NonRepeatingCharUsingSet();
//        var res = charUsingSet.charFinder("green apple");
//
//        if (res != Character.MIN_VALUE)
//            System.out.println(res);
//        else
//            System.out.println("Every character is unique!");
//    }

//    private void moshNoRepeat() {
//        MoshNonRepeatedCharInString string = new MoshNonRepeatedCharInString();
//        var res = string.nonRepeatingChars("a green apple");
//        System.out.println(res);
//    }

//    private void noRepeat() {
//        NonRepeatedCharInString inString = new NonRepeatedCharInString("Manhattan");
//        var res = inString.getNonRepeated();
//
//        if (res != Character.MIN_VALUE)
//            System.out.println(res);
//        else
//            System.out.println("Every character is repeated");
//    }

//    private void incompleteQueueUsingStack() {
//        QueueUsingStack queue = new QueueUsingStack();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//    }

//    private void myQueue() {
//        MyQueue queue = new MyQueue(5);
//
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//
//        queue.enqueue(4);
//        queue.enqueue(5);
//        queue.enqueue(6);
//        queue.enqueue(7);
//        queue.enqueue(8);
//
//        System.out.println(queue);
//    }

//    private void reverseQueue() {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//
//        ReverseQueue reverseQueue = new ReverseQueue();
//        reverseQueue.reverse(queue);
//    }

//    private void myStack() {
//        MyStack stack = new MyStack(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
//    }

//    private void checkBalancedExpression() {
//        String expression = "<>";
//
//        var checker = new ExpressionChecker();
//        System.out.println(checker.isExpressionBalanced(expression));
//    }

//    private void reverseString() {
//        String toReverse = "ABCDEF";
//        var reverse = new Reverser();
//        String reversed = reverse.reverseString(toReverse);
//
//        System.out.println(reversed);
//    }

//    private void moshArray() {
//        MoshArray numbers = new MoshArray(3);
//
//        numbers.insert(12);
//        numbers.insert(23);
//        numbers.insert(34);
//        numbers.insert(45);
//        numbers.insert(56);
//        numbers.insert(67);
//        numbers.insert(76);
//
//        numbers.removeAt(5);
//
//        numbers.print();
//    }

//    private void myArray() {
//        // Make a dynamic Array
//        MyArray array = new MyArray(5);
//        array.insert(56);
//        array.insert(45);
//        array.insert(28);
//        array.insert(69);
//        array.insert(32);
//        array.insert(36);
//        array.insert(19);
//        array.insert(7);
//        array.insert(71);
//
//        System.out.println("Array: " + array);
//        System.out.println("Index of 69: " + array.indexOf(69));
//    }

//    private void repeat() {
//        NonRepeatedCharInString inString = new NonRepeatedCharInString("a green apple");
//        inString.getNonRepeated();
//    }

//    private void hash() {
//        // Key: Employee Code (Integer)
//        // Value: Name (String)
//        // Yes, HashMaps allow null keys and null values
//        Map<Integer, String> map = new HashMap<>();
//
//        // Add a key: value player
//        map.put(1, "Kashif");
//        map.put(2, "Ifkash");
//        map.put(3, "Nibba");
//        map.put(null, null);
//        map.remove(null);
//
//        var val = map.get(2);
//        System.out.println(val);
//
//        map.containsKey(2);             // O(1)
//        map.containsValue("Nibba");     // O(n)
//
//        System.out.println(map);
//
//        for (var item : map.entrySet())
//            System.out.println(item);
//    }

}
