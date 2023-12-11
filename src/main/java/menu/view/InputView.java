package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.util.StringUtils;

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
        String[] splitNames = StringUtils.split(input);
    }
}
