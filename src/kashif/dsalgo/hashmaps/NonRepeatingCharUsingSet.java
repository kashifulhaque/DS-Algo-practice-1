package kashif.dsalgo.hashmaps;

import java.util.HashSet;

public class NonRepeatingCharUsingSet {

    public char charFinder(String string) {
        var integerSet = new HashSet<Character>();

        for (var c : string.toCharArray()) {
            if (integerSet.contains(c))
                return c;

            integerSet.add(c);
        }

        return Character.MIN_VALUE;
    }

}
