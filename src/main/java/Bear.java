import java.time.LocalDate;

public class Bear {
    protected LocalDate lastMeal;
    protected int weight;

    public Bear() {
        this(null);
    }
    public Bear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }

    public void eat(int mealWeight) {
        weight += mealWeight;
        lastMeal = LocalDate.now();
    }

    public int getWeight() {
        return weight;
    }
}
