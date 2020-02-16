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
    public String attack(Bear target) {
        return "You "+target.getName()+" are killed by "+getName();
    }

    @Override
    public String getName() {
        return "Polar Bear";
    }

}
