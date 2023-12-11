package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.util.StringUtils;
import menu.util.Validation;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> readName() {
        boolean flag;
        String[] names;

        do {
            String input = Console.readLine();
            names = StringUtils.split(input);

            try {
                Validation.nameOutOfLength(names);
                Validation.coachOutOfCount(names);
                Validation.duplicateName(names);

                flag = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);

        return List.of(names);
    }

    public void readDontEat() {
        String input = Console.readLine();
    }
}
