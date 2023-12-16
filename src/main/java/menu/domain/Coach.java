package menu.domain;

import menu.constant.Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Coach {
    private String name;
    private List<String> cantEats;
    private List<String> foods;

    public Coach(String name, List<String> cantEats) {
        this.name = name;
        this.cantEats = cantEats;
        foods = new ArrayList<>();
    }

    public void addFood(Menu category) {
        while (foods.size() < Menu.values().length) {
            String food = Menu.findFoodInCategory(category);
            if (!cantEats.contains(food) && !foods.contains(food)) {
                foods.add(food);
                return;
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getFoods() {
        return Collections.unmodifiableList(foods);
    }
}
