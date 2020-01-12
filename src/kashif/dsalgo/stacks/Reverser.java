package kashif.dsalgo.stacks;

import java.util.Stack;

public class Reverser {

    public String reverseString(String toReverse) {
        if (toReverse == null)
            throw new IllegalArgumentException();

        var charStack = new Stack<Character>();

        for (char c : toReverse.toCharArray())
            charStack.push(c);

        StringBuilder reverseBuffer = new StringBuilder();
        while (!charStack.empty())
            reverseBuffer.append(charStack.pop());

        return reverseBuffer.toString();
    }

}
