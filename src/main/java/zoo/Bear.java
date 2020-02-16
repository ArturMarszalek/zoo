package zoo;

import java.time.LocalDate;

public class Bear extends Animal {

    public Bear() {
        super();
    }

    public Bear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public boolean canDisplay() {
        return true;
    }

    public int getWeight() {
        return 0;
    }

}
