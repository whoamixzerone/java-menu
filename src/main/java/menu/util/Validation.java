package menu.util;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Validation {
    public static void duplicateName(String[] names) {
        int countName = (int) Arrays.stream(names)
                .distinct()
                .count();

        if (names.length != countName) {
            throw new IllegalArgumentException("[ERROR] 코치는 중복될 수 없습니다.");
        }
    }

    public static void coachOutOfCount(final String[] names) {
        if (isCountOutOfRange(names)) {
            throw new IllegalArgumentException("[ERROR] 코치는 최소 2명 이상 혹은 최대 5명까지 입력해야 합니다.");
        }
    }

    private static boolean isCountOutOfRange(String[] names) {
        return names.length < 2 || names.length > 5;
    }

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
