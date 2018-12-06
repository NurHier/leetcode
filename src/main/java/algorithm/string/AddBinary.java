package algorithm.string;

import java.util.ArrayList;
import java.util.List;

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int len = aChars.length;
        if (aChars.length > bChars.length) {
            len = bChars.length;
        }
        List<Integer> binary = new ArrayList<>();
        int carry = 0;
        for (int i = len - 1; i >= 0; i--) {
            int temp = aChars[aLen] - '0' + bChars[bLen] - '0' + carry;
            carry = 0;
            if (temp == 0) {
                binary.add(0);
            } else if (temp == 1) {
                binary.add(1);
            } else if (temp == 2) {
                binary.add(0);
                carry = 1;
            } else if (temp == 3) {
                binary.add(1);
                carry = 1;
            }
            aLen--;
            bLen--;
        }
        if (aLen >= 0) {
            for (int i = aLen; i >= 0; i--) {
                int temp = aChars[i] - '0' + carry;
                carry = 0;
                if (temp == 0) {
                    binary.add(0);
                } else if (temp == 1) {
                    binary.add(1);
                } else if (temp == 2) {
                    binary.add(0);
                    carry = 1;
                }
            }
        }
        if (bLen >= 0) {
            for (int i = bLen; i >= 0; i--) {
                int temp = bChars[i] - '0' + carry;
                carry = 0;
                if (temp == 0) {
                    binary.add(0);
                } else if (temp == 1) {
                    binary.add(1);
                } else if (temp == 2) {
                    binary.add(0);
                    carry = 1;
                }
            }
        }
        if (carry == 1) {
            binary.add(1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = binary.size() - 1; i >= 0; i--) {
            sb.append(binary.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("100", "110010"));
    }
}
