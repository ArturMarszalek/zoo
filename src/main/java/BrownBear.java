import java.time.LocalDate;

public class BrownBear extends Bear {

    public BrownBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }
    @Override
    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(5));
    }
}
