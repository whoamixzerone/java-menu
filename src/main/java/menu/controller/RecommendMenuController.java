package menu.controller;

import menu.domain.Coach;
import menu.domain.RecommendCategory;
import menu.domain.RecommendMenu;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.ArrayList;
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
        List<Coach> coaches = cantEatCoach(names);

        RecommendMenu recommendMenu = new RecommendMenu(new RecommendCategory(), coaches);

        outputView.printRecommendMenuResult(recommendMenu);
    }

    private List<Coach> cantEatCoach(List<String> names) {
        List<Coach> coaches = new ArrayList<>();

        for (String name : names) {
            outputView.printCantEatMenu(name);
            coaches.add(new Coach(name, inputView.readCantEat()));
        }

        return  coaches;
    }
}
