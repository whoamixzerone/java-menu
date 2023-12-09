package menu.controller;

import menu.view.InputView;
import menu.view.OutputView;

public class RecommendMenuController {
    private InputView inputView;
    private OutputView outputView;

    public RecommendMenuController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void execute() {
        outputView.printRecommendStart();
    }
}
