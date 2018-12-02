package algorithm.hash;

public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        char[] Jc = J.toCharArray();
        char[] Sc = S.toCharArray();
        int count = 0;
        for (int i = 0; i < Jc.length; i++) {
            for (int j = 0; j < Sc.length; j++) {
                if (Jc[i] == Sc[j]) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
