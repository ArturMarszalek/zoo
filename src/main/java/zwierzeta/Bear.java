package zwierzeta;

import java.time.LocalDate;


public abstract class Bear {

    protected LocalDate lastMeal;
    protected LocalDate mealTime;

    int weight;
    int mealWeight;

    public int getWeight() {
        return weight;
    }

    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }

    public void eat() {
        weight += mealWeight;
        mealTime = LocalDate.now();
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public LocalDate getMealTime() {
        return mealTime;
    }

    public String display() {
        return "jestem niedzwiedziem " + getName() ;
    }

    protected abstract String getName();
}
