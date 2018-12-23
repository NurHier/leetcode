package algorithm.array;

/**
 * 66 加一
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int carry = 1;
        for (; index >= 0; index--) {
            if (carry == 0) {
                break;
            }
            if (digits[index] + carry == 10) {
                digits[index] = 0;
            } else {
                carry = 0;
                digits[index] = digits[index] + 1;
            }
        }
        if (carry == 1) {
            int[] newRe = new int[digits.length + 1];
            newRe[0] = 1;
            return newRe;
        }
        return digits;
    }

    public int[] plusOne2(int[] digits) {
        int index = digits.length - 1;
        for (; index >= 0; index--) {
            if (digits[index] + 1 == 10) {
                digits[index] = 0;
            } else {
                digits[index] = digits[index] + 1;
                return digits;
            }
        }
        int[] newRe = new int[digits.length + 1];
        newRe[0] = 1;
        return newRe;
    }

    public static void main(String[] args) {
        new PlusOne().plusOne(new int[]{1, 2, 3});
    }
}
