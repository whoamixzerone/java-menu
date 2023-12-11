package menu.view;

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
        System.out.println();
        System.out.println("코치의 이름을 입력해 주세요. (, 로 구분)");
    }

    public void printDontEatMenu(String name) {
        System.out.printf("%n%s(이)가 못 먹는 메뉴를 입력해 주세요.%n", name);
    }
}
