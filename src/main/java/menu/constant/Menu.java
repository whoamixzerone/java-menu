package menu.constant;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Menu {
    JAPANESE("일식", Arrays.asList("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼")),
    KOREAN("한식", Arrays.asList("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음")),
    CHINESE("중식", Arrays.asList("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채")),
    ASIAN("아시안", Arrays.asList("팟타이", "카오 팟", "나시고랭", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜")),
    WESTERN("양식", Arrays.asList("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니")),
    NONE("없음", Collections.EMPTY_LIST);

    private String category;
    private List<String> foods;

    Menu(String category, List<String> foods) {
        this.category = category;
        this.foods = foods;
    }

    public static boolean hasMenu(String menu) {
        return Arrays.stream(Menu.values())
                .anyMatch(category -> hasFood(category, menu));
    }

    private static boolean hasFood(Menu category, String menu) {
        return category.foods.stream()
                .anyMatch(food -> food.equals(menu));
    }

    public static String findCategoryByIndex(int index) {
        return Menu.values()[index - 1].category;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getFoods() {
        return foods;
    }
}
