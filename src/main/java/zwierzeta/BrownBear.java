package zwierzeta;


import java.time.LocalDate;

public class BrownBear extends Bear {
    public BrownBear() {
        super();
        weight = 100;
    }


    public BrownBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }
}
