import java.time.LocalDate;

public abstract class Bear {
    protected LocalDate lastMeal;
    protected int weight;

    public abstract String getName();

    public abstract String attack(Bear target);

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

    public String display() {
        return "Jestem " + getName();
    }

}

