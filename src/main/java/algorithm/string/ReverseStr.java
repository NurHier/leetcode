package algorithm.string;

public class ReverseStr {
    public String reverseStr(String s, int k) {
        int remainLength = s.length();
        int start = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (remainLength < k) {
                sb.append(reverse(s.substring(start, s.length())));
                break;
            } else if (remainLength < 2 * k) {
                sb.append(reverse(s.substring(start, start + k)));
                sb.append(s.substring(start + k, s.length()));
                break;
            } else {
                sb.append(reverse(s.substring(start, start + k)));
                sb.append(s.substring(start + k, start + 2 * k));
                start = start + 2 * k;
                remainLength = s.length() - start;
            }
        }
        return sb.toString();
    }

    private String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseStr().reverseStr("qw", 2));
    }
}
