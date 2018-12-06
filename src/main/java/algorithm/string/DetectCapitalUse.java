package algorithm.string;

/**
 * 检测大写字母
 */
public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        } else {
            boolean isLowerCaseFor0 = isLowerCase(word.charAt(0));
            for (int i = 1; i < word.length(); i++) {
                if (isLowerCaseFor0) {
                    if (!isLowerCase(word.charAt(i))) {
                        return false;
                    }
                } else {
                    if (word.length() == 2) {
                        return true;
                    } else {
                        boolean isLowerCaseFor1 = isLowerCase(word.charAt(1));
                        if (isLowerCaseFor1) {
                            if (!isLowerCase(word.charAt(i))) {
                                return false;
                            }
                        } else {
                            if (isLowerCase(word.charAt(i))) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    private boolean isLowerCase(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static void main(String[] args) {
        System.out.println(new DetectCapitalUse().detectCapitalUse("LLetcode"));
    }
}
