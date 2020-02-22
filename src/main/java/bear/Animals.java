package bear;

import java.time.LocalDate;


public abstract class Animals {

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
        return "jestem niedzwiedziem " + getName();
    }
    public abstract String Attack(Animals bear);


    protected abstract String getName();



}