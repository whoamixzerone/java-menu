package menu.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static InputView inputView;

    private InputView() {
    }

    public static InputView getInstance() {
        if (inputView == null) {
            inputView = new InputView();
        }
        return inputView;
    }

    public void readName() {
        String input = Console.readLine();
    }
}
