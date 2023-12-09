package menu;

import menu.controller.RecommendMenuController;
import menu.view.InputView;
import menu.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = InputView.getInstance();
        OutputView outputView = OutputView.getInstance();
        RecommendMenuController recommendMenuController = new RecommendMenuController(inputView, outputView);
        recommendMenuController.execute();
    }
}
