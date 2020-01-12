package kashif.dsalgo.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExpressionChecker {

    private static final List<Character> leftBrackets = Arrays.asList('(', '{', '[', '<');
    private static final List<Character> rightBrackets = Arrays.asList(')', '}', ']', '>');

    public Boolean isExpressionBalanced(String expression) {
        if (expression == null)
            throw new IllegalArgumentException();

        var expressionStack = new Stack<Character>();
        for (char exp : expression.toCharArray()) {
            if (isLeftBracket(exp))
                expressionStack.push(exp);

            if (isRightBracket(exp)){
                if (expressionStack.empty())
                    return false;

                var top = expressionStack.pop();
                if (!bracketsMatch(top, exp))
                    return false;
            }
        }

        return expressionStack.empty();
    }

    private boolean isLeftBracket(char exp) {
        return leftBrackets.contains(exp);
    }

    private boolean isRightBracket(char exp) {
        return rightBrackets.contains(exp);
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

}
