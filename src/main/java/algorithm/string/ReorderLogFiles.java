package algorithm.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 937. 重新排列日志文件
 */
public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letterLogs = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        for (String log : logs) {
            int index = log.indexOf(" ");
            char firstChar = log.charAt(index + 1);
            if (firstChar >= '0' && firstChar <= '9') {
                digitLogs.add(log);
            } else {
                letterLogs.add(log);
            }
        }
        Collections.sort(letterLogs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String log1 = o1.substring(o1.indexOf(" "));
                String log2 = o2.substring(o2.indexOf(" "));
                return log1.compareTo(log2);
            }
        });
        letterLogs.addAll(digitLogs);
        return letterLogs.toArray(logs);
    }
}
