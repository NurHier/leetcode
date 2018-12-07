package algorithm.string;

/**
 * 机器人能否返回原点
 */
public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int stepV = 0;
        int stepH = 0;
        char[] moveArray = moves.toCharArray();
        for (char move : moveArray) {
            switch (move) {
                case 'R':
                    stepH++;
                    break;
                case 'L':
                    stepH--;
                    break;
                case 'U':
                    stepV++;
                    break;
                case 'D':
                    stepV--;
                    break;
                default:
            }
        }
        return stepV == 0 && stepH == 0;
    }

    public static void main(String[] args) {
        System.out.println(new JudgeCircle().judgeCircle("RD"));
    }
}
