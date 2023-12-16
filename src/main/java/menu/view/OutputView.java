package menu.view;

import menu.constant.Menu;
import menu.domain.Coach;
import menu.domain.RecommendMenu;

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
        System.out.println("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");
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
        for (Menu category : recommendMenu.getCategories()) {
            System.out.print(" | " + category.getCategory());
        }
        System.out.println(" ]");
    }
}
