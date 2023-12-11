package menu.util;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Validation {
    public static void nameOutOfLength(String[] names) {
        Predicate<String> predicate = Validation::isLengthOutOfRange;
        Consumer<String> consumer = (name) -> {
            throw new IllegalArgumentException("[ERROR] 코치 이름은 최소 2글자, 최대 4글자로 입력해야 합니다.");
        };

        Arrays.stream(names)
                .filter(name -> predicate.test(name))
                .findAny()
                .ifPresent(consumer);
    }

    private static boolean isLengthOutOfRange(String name) {
        return name.length() < 2 || name.length() > 4;
    }
}
