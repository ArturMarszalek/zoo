import java.time.LocalDate;

public abstract class Bear {

    private LocalDate lastMeal;
    public Bear(LocalDate lastMeal) {
        this.lastMeal= lastMeal;
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public boolean isAlive(){
return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }

    public int getWeight(){
        return 0;
    }

    public LocalDate eat(){
       return lastMeal=LocalDate.now();
    }
}
