package lotto.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Parser {
    public static int stringToInt(String str) {
        try {
            return Integer.parseInt(str);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException();
        }
    }

    public static List<Integer> stringToList(String str) {
        try {
            return Stream.of(str.split("")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        }catch (NumberFormatException e){
            throw new IllegalArgumentException();
        }
    }
}
