package algorithm.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {
    public String[] uncommonFromSentences(String A, String B) {
        String[] aa = A.split(" ");
        String[] bb = B.split(" ");
        Map<String, Integer> map = new HashMap<>();
//        for (String a : aa) {
//            map.merge(a, 1, (x, y) -> x + y);
//        }
//        for (String b : bb) {
//            map.merge(b, 1, (x, y) -> x + y);
//        }
        List<String> re = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                re.add(key);
            }
        }
        return re.toArray(new String[0]);
    }
    public static void main(String[] args) {
      new UncommonFromSentences().uncommonFromSentences("a c c", "b d c");
    }
}
