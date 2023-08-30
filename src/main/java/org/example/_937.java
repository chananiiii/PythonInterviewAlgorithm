package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class _937 {
    public static void main(String[] args) {
        reorderLogFiles(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"});
    }

    public static String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String [] strArray1 = o1.split(" ");
                String [] strArray2 = o2.split(" ");

                boolean isDigit1 = Character.isDigit(strArray1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(strArray2[1].charAt(0));

                if(!isDigit1 && !isDigit2) {
                    if(strArray1[1].compareTo(strArray2[1]) == 0) {
                        return strArray1[0].compareTo(strArray2[0]);
                    }
                    else {
                        return strArray1[1].compareTo(strArray2[1]);
                    }
                }
                else if(isDigit1) {
                    return 1;
                }
                else if(isDigit2){
                    return -1;
                }
                return 0;
            }
        });

        return logs;
    }
}
