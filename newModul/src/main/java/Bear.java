import java.time.LocalDate;

public abstract class Bear {
    protected int weigth;
    private LocalDate lastMeal;
    private int weight;

    public Bear() {

    }

    public Bear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public Bear(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }

    public int getWeight() {
        return weight;
    }

    public void eat() {
        lastMeal = LocalDate.now();
    }

    public void eat(int mealWeigth) {
        weigth += mealWeigth;
    }
}
