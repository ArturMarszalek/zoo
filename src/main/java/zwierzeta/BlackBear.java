package zwierzeta;

import java.time.LocalDate;

public class BlackBear extends Bear {
    private LocalDate lastMeal;


    public BlackBear(LocalDate lastMeal){
        this.lastMeal = lastMeal;
    }
    public boolean isAlive(){
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }
}
