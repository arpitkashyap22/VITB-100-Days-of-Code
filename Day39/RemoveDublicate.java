package Day39;

import java.util.HashSet;

public class RemoveDublicate {
    String removeDuplicates(String str) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
