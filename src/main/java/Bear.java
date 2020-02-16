import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Bear {
    protected LocalDate lastMeal;
    protected LocalDate mealTime;



    int weight;
    int mealWeight;

    public abstract String getName();

    public int getWeight() {
        return weight;
    }

    public String display(){
        return "Jestem "  + getName();
    }

    public boolean isAlive(){
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
}
