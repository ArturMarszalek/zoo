package ZOO.Species;

import ZOO.Bear;

import java.time.LocalDate;

public class PolarBear extends Bear {
    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public PolarBear() {
    }

    public PolarBear(int weight) {
        super(weight);
    }

    @Override
    public String attack(Bear target) {
        target.youAreAttacked(target.getWeight());
        return "You "+target.getName()+" are killed by "+getName();
    }

    @Override
    public String getName() {
        return "Polar Bear";
    }

}
