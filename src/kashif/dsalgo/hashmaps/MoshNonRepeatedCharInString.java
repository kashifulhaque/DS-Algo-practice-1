package kashif.dsalgo.hashmaps;

import java.util.HashMap;

public class MoshNonRepeatedCharInString {

    public char nonRepeatingChars(String string) {
        var map = new HashMap<Character, Integer>();
        var charArray = string.toCharArray();

        for (var ch : charArray) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch : charArray) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return Character.MIN_VALUE;
    }

}
