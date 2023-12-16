package menu.view;

import menu.constant.Menu;
import menu.constant.Weekdays;
import menu.domain.Coach;
import menu.domain.RecommendMenu;

import java.util.Arrays;

public class OutputView {
    private static OutputView outputView;

    private OutputView() {
    }

    public static OutputView getInstance() {
        if (outputView == null) {
            outputView = new OutputView();
        }
        return outputView;
    }

    public void printRecommendStart() {
        System.out.println("점심 메뉴 추천을 시작합니다.");
        System.out.printf("%n코치의 이름을 입력해 주세요. (, 로 구분)%n");
    }

    public void printCantEatMenu(String name) {
        System.out.printf("%n%s(이)가 못 먹는 메뉴를 입력해 주세요.%n", name);
    }

    public void printRecommendMenuResult(RecommendMenu recommendMenu) {
        System.out.printf("%n메뉴 추천 결과입니다.%n");

        printWeekdays();
        printRecommendCategories(recommendMenu);
        printRecommendCoachMenu(recommendMenu);

        System.out.print("추천을 완료했습니다.");
    }

    private void printRecommendCoachMenu(RecommendMenu recommendMenu) {
        for (Coach coach : recommendMenu.getCoaches()) {
            System.out.print("[ " + coach.getName());

            for (String food : coach.getFoods()) {
                System.out.print(" | " + food);
            }
            System.out.println(" ]");
        }
        System.out.println();
    }

    private void printRecommendCategories(RecommendMenu recommendMenu) {
        System.out.print("[ 카테고리");

        recommendMenu.getCategories().stream()
                .forEach(category -> System.out.print(" | " + category.getCategory()));

        System.out.println(" ]");
    }

    private void printWeekdays() {
        System.out.print("[ 구분");

        Arrays.stream(Weekdays.values())
                .forEach(day -> System.out.print(" | " + day.getDay()));

        System.out.println(" ]");
    }
}
