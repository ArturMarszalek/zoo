package Species;

import java.time.LocalDate;

public class TeddyBear extends Bear {
    public TeddyBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public TeddyBear() {
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void eat() {
    }
}
