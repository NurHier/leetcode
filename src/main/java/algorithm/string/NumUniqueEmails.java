package algorithm.string;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            String[] emailSplit = email.split("@");
            String email0 = emailSplit[0];
            String email1 = emailSplit[1];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < email0.length(); i++) {
                char c = email0.charAt(i);
                if (c == '+') {
                    break;
                } else if (c == '.') {
                    continue;
                }
                sb.append(c);
            }
            set.add(sb.append(email1).toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(new NumUniqueEmails().numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"}));
    }
}
