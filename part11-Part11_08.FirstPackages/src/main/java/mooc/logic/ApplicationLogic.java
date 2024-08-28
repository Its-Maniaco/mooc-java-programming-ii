package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic implements UserInterface {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            this.update();
            this.ui.update();
        }
    }

    public void update() {
        System.out.println("\"Application logic is working\"");
    }
}
