package bear;

import java.time.LocalDate;

public class BrownBear extends Animals {
    public BrownBear() {
        super();
        weight = 100;
    }


    public BrownBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    public String Attack(Animals bear) {
        return "Ja " + getName() + " atakuje" + bear.getName();
    }

    @Override
    protected String getName() {
        return "Brunatnym";
    }
}