package ZOO;

import java.time.LocalDate;

public abstract class Bear {
    protected LocalDate lastMeal;
    protected int weight;

    public Bear(int weight) {
        this.weight = weight;
    }

    public Bear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public Bear() {

    }

    public int getWeight() {
        return weight;
    }

    public boolean isAlive() {
        return lastMeal.isAfter((LocalDate.now().minusDays(10)));
    }

    public void eat(int foodWeight) {
        lastMeal = LocalDate.now();
        weight = weight + foodWeight;
    }
    public void eat() {
        lastMeal = LocalDate.now();
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public String attack() {
        return "You are wounded by Bear";

    }
}
