package menu.domain;

import menu.constant.Menu;

import java.util.Collections;
import java.util.List;

public class RecommendMenu {
    private List<Menu> categories;
    private List<Coach> coaches;

    public RecommendMenu(RecommendCategory recommendCategory, List<Coach> coaches) {
        this.categories = recommendCategory.recommendCategoryOfDays();
        this.coaches = coaches;
        recommendMenuByCategory();
    }

    private void recommendMenuByCategory() {
        for (Coach coach : coaches) {
            for (Menu category : categories) {
                coach.addFood(category);
            }
        }
    }

    public List<Menu> getCategories() {
        return Collections.unmodifiableList(categories);
    }

    public List<Coach> getCoaches() {
        return Collections.unmodifiableList(coaches);
    }
}
