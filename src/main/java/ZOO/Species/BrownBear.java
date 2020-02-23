package ZOO.Species;

import ZOO.Animal;

import java.time.LocalDate;

public class BrownBear extends Animal {
    public BrownBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public BrownBear() {
    }

    public BrownBear(int weight) {
        super(weight);
    }

    @Override
    public String getName() {
        return "Brown Bear";
    }

    public BrownBear(int weight, LocalDate lastMeal) {
        super(weight, lastMeal);
    }
}
