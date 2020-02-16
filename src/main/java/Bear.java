import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Bear {
    protected LocalDate lastMeal;
    protected LocalDate mealTime;

    public abstract boolean isAlive();

    public void eat() {
        mealTime = LocalDate.now();
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public LocalDate getMealTime() {
        return mealTime;
    }
}
