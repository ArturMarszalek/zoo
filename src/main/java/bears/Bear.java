package bears;

import org.joda.time.DateTime;

import java.time.LocalDate;

public class Bear {

    private LocalDate lastMeal;
    private LocalDate dateOfMeal;

    public Bear(){
    }
    public Bear(LocalDate lastMeal){
        this.lastMeal = lastMeal;
    }
    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }

    public LocalDate eat() {
        return LocalDate.now();
    }
}
