package kashif.dsalgo.hashmaps;

import java.util.HashMap;

public class NonRepeatedCharInString {

    private String string;
    private HashMap<Integer, Character> map;

    public NonRepeatedCharInString(String text) {
        this.string = text;
        map = new HashMap<>();

        for (int i = 0; i < string.length(); ++i) {
            map.put(i + 1, string.charAt(i));
        }
    }

    public char getNonRepeated() {

        for (int i = 1; i <= string.length(); ++i) {
            var toMatch = map.get(i);
            map.remove(i);

            if (!map.containsValue(toMatch)) {
                return toMatch;
            }
        }

        return Character.MIN_VALUE;
    }

}
