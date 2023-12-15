package menu.domain;

import menu.constant.Menu;
import menu.constant.Weekdays;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class RecommendMenu {
    Map<Weekdays, List<Coach>> recommeds;

    public RecommendMenu(Coach coach, List<String> donEats) {
        recommeds = new EnumMap<>(Weekdays.class);

        recommedMenuExecute(coach, donEats);
    }

    private void recommedMenuExecute(Coach coach, List<String> donEats) {
        String category = Menu.findCategoryByIndex(Recommend.getCategoryIndex());
    }
}
