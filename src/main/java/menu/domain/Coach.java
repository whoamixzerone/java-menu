package menu.domain;

import menu.constant.Menu;

import java.util.Map;

public class Coach {
    private String name;
    private Map<Menu, String> menus;

    public Coach(String name) {
        this.name = name;
    }
}
