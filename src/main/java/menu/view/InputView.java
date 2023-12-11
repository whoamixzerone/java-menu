package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.util.StringUtils;
import menu.util.Validation;

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
        boolean flag;

        do {
            String input = Console.readLine();
            String[] splitNames = StringUtils.split(input);
            try {
                Validation.nameOutOfLength(splitNames);
                flag = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);
    }
}
