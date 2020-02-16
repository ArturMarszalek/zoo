import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Bear {
    protected LocalDate lastMeal;
    protected LocalDate mealTime;

    String name;

    int weight;
    int mealWeight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void showYourself(){
        System.out.println(name);
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
