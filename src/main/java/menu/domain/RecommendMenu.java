package menu.domain;

import menu.constant.Menu;
import menu.constant.Weekdays;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class RecommendMenu {
    Map<Weekdays, List<Coach>> recommeds;

    public RecommendMenu(String name, List<String> donEats) {
        recommeds = new EnumMap<>(Weekdays.class);

        List<String> categories = recommendCategoryOfDays();
    }

    private List<String> recommendCategoryOfDays() {
        List<String> categories = new ArrayList<>();

        while (categories.size() < Menu.values().length) {
            String category = Menu.findCategoryByIndex(Recommend.getCategoryIndex());
            categories.add(category);
        }

        return categories;
    }
}
