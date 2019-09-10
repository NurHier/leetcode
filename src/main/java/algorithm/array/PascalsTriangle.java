package algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 118 杨辉三角
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        if (numRows <= 0) {
            return result;
        }
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        if (numRows == 1) {
            return result;
        }
        for (int i = 1; i < numRows; i++) {
            row = result.get(i - 1);
            List<Integer> rowTemp = new ArrayList<>();
            rowTemp.add(1);
            for (int j = 0; j < row.size() - 1; j++) {
                rowTemp.add(row.get(j) + row.get(j + 1));
            }
            rowTemp.add(1);
            result.add(rowTemp);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new PascalsTriangle().generate(1));
        System.out.println(new PascalsTriangle().generate(2));
        System.out.println(new PascalsTriangle().generate(5));
    }
}
