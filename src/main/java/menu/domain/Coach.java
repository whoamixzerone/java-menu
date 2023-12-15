package menu.domain;

import menu.constant.Menu;

import java.util.List;

public class Coach {
    private String name;
    private List<Menu> categories;
    private List<String> foods;

    public Coach(String name, List<Menu> categories, List<String> foods) {
        this.name = name;
        this.categories = categories;
        this.foods = foods;
    }
}
