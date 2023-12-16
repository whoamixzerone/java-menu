package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Menu;

import java.util.ArrayList;
import java.util.List;

public class RecommendCategory {
    private static final int MAX_CATEGORY = 2;
    private static final int CATEGORY_LENGTH = 5;

    public RecommendCategory() {
    }

    public List<Menu> recommendCategoryOfDays() {
        List<Menu> categories = new ArrayList<>();

        while (categories.size() < Menu.values().length) {
            Menu category = Menu.findCategoryByIndex(getCategoryIndex());
            if (isAllowMenuOutOfCount(categories, category)) {
                categories.add(category);
            }
        }

        return categories;
    }

    private int getCategoryIndex() {
        return Randoms.pickNumberInRange(1, CATEGORY_LENGTH);
    }

    private boolean isAllowMenuOutOfCount(List<Menu> categories, Menu category) {
        int categoryCount = (int) categories.stream()
                .filter(category::equals)
                .count();
        return categoryCount < MAX_CATEGORY;
    }
}
