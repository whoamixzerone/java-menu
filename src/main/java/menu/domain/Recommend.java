package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Recommend {
    private static final int CATEGORY_LENGTH = 5;
    public static int getCategoryIndex() {
        return Randoms.pickNumberInRange(1, CATEGORY_LENGTH);
    }
}
