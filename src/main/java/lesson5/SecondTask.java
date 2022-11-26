package lesson5;

import java.util.HashSet;
import java.util.Set;

public class SecondTask {
    public int countWords(String[] words1, String[] words2) {

        Set<String> usedOnceInWords1 = new HashSet<>();
        Set<String> usedMoreThanOnce = new HashSet<>();
        Set<String> usedOnceInWords1andWords2 = new HashSet<>();

        for (String str : words1) {
            if (usedOnceInWords1.contains(str)) {
                usedOnceInWords1.remove(str);
                usedMoreThanOnce.add(str);
            }
            if (!usedMoreThanOnce.contains(str)) {
                usedOnceInWords1.add(str);
            }
        }
        for (String str : words2) {
            if (usedOnceInWords1.contains(str)) {
                if (usedOnceInWords1andWords2.contains(str)) {
                    usedOnceInWords1andWords2.remove(str);
                    usedMoreThanOnce.add(str);
                }
                if (!usedMoreThanOnce.contains(str)) {
                    usedOnceInWords1andWords2.add(str);
                }
            }
        }
        return usedOnceInWords1andWords2.size();

    }
}
