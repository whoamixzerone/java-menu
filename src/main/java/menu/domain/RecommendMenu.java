package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Menu;

import java.util.ArrayList;
import java.util.List;

public class RecommendMenu {
    private static final int MAX_CATEGORY = 2;
    private static final int CATEGORY_LENGTH = 5;
    List<Coach> coaches;

    public RecommendMenu(String name, List<String> donEats) {
        coaches = new ArrayList<>();

        List<Menu> categories = recommendCategoryOfDays();
        List<String> foods = recommendMenuByCategory(categories, donEats);
        coaches.add(new Coach(name, categories, foods));
    }

    private List<String> recommendMenuByCategory(List<Menu> categories, List<String> donEats) {
        List<String> foods = new ArrayList<>();

        for (Menu category : categories) {
            while (foods.size() < Menu.values().length) {
                String food = Menu.findFoodInCategory(category);
                if (!donEats.contains(food) && !foods.contains(food)) {
                    foods.add(food);
                    break;
                }
            }
        }
        return foods;
    }

    private int getCategoryIndex() {
        return Randoms.pickNumberInRange(1, CATEGORY_LENGTH);
    }

    private List<Menu> recommendCategoryOfDays() {
        List<Menu> categories = new ArrayList<>();

        while (categories.size() < Menu.values().length) {
            Menu category = Menu.findCategoryByIndex(getCategoryIndex());
            if (isAllowMenuOutOfCount(categories, category)) {
                categories.add(category);
            }
        }

        return categories;
    }

    private boolean isAllowMenuOutOfCount(List<Menu> categories, Menu category) {
        int categoryCount = (int) categories.stream()
                .filter(category::equals)
                .count();
        return categoryCount < MAX_CATEGORY;
    }
}
