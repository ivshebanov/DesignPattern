package ilya;

import ilya.UI.UI;

public class Main {

    public static void main(String[] args) {
        UI ui = new UI(new Player());
        ui.init();
    }
}
