package Species;

import java.time.LocalDate;

public abstract class Bear {
    public LocalDate lastMeal;

    public Bear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public Bear() {

    }

    public boolean isAlive() {
        return lastMeal.isAfter((LocalDate.now().minusDays(10)));
    }

    public void eat() {
        LocalDate lastMeal = LocalDate.now();
    }
}
