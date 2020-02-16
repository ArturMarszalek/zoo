package zwierzeta;

import java.time.LocalDate;

public class PolarBear extends Bear {
    private LocalDate lastMeal;


    public PolarBear(LocalDate lastMeal){
        this.lastMeal = lastMeal;
    }

}
