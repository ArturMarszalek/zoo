import java.time.LocalDate;

public class PolarBear extends Bear {

    public PolarBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }
    @Override
    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(15));
    }
}
