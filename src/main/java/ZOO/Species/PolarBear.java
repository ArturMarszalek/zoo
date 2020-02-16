package ZOO.Species;

import ZOO.Bear;

import java.time.LocalDate;

public class PolarBear extends Bear {
    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public PolarBear() {
    }

    @Override
    public String attack() {
        return "You are killed by Bear";
    }

    @Override
    protected String getName() {
        return " polarny";
    }

}
