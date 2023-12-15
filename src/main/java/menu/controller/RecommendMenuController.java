package menu.controller;

import menu.domain.Coach;
import menu.domain.RecommendMenu;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class RecommendMenuController {
    private InputView inputView;
    private OutputView outputView;

    public RecommendMenuController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void execute() {
        outputView.printRecommendStart();
        List<String> names = inputView.readName();

        for (String name : names) {
            outputView.printDontEatMenu(name);
            List<String> donEats = inputView.readDontEat();
            Coach coach = new Coach(name);
            RecommendMenu recommendMenu = new RecommendMenu(coach, donEats);
        }
    }
}
