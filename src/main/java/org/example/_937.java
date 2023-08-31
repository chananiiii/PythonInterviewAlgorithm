package org.example;

import java.util.*;

public class _937 {
    public static void main(String[] args) {
        reorderLogFiles(new String[]{"j mo", "5 m w", "g 07", "o 2 0", "t q h"});
    }

    public static String[] reorderLogFiles(String[] logs) {
        List<String> letters = new ArrayList<>();
        List<String> digits = new ArrayList<>();

        for (String log : logs) {
            String identifier = log.split(" ")[0];
            String logWoIdentifier = log.substring(identifier.length());

            if (isNumeric(logWoIdentifier)) {
                digits.add(log);
            } else {
                letters.add(log);
            }
        }
        Collections.sort(letters, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                String identifier1 = o1.split(" ")[0];
                String logWoIdentifier1 = o1.substring(identifier1.length());

                String identifier2 = o2.split(" ")[0];
                String logWoIdentifier2 = o2.substring(identifier2.length());

                if (logWoIdentifier1.compareTo(logWoIdentifier2) == 0) {
                    return identifier1.compareTo(identifier2);
                }

                return logWoIdentifier1.compareTo(logWoIdentifier2);
            }
        });


        letters.addAll(digits);

        return letters.toArray(new String[0]);
    }

    public static boolean isNumeric(String target) {

        for (char c : target.replaceAll(" ", "").toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
