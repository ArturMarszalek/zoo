import java.time.LocalDate;

public class Blackbear extends Bear {

    public Blackbear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }
}
