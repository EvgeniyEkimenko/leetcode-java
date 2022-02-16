package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {

    }

    public int firstUniqChar(String s) {

        char[] chArray = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chArray.length; i++) {
            if (map.containsKey(chArray[i])) {
                map.put(chArray[i], 2);
            } else {
                map.put(chArray[i], 1);
            }
        }

        for (int i = 0; i < chArray.length; i++) {
            if (map.get(chArray[i]) == 1) return i;
        }

        return -1;
    }
}
