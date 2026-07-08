
import java.util.HashMap;
import java.util.Map;

public class FrequencyString {
    public static void main(String[] args) {ft

        String s = "frequency";
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

