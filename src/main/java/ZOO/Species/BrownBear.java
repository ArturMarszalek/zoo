package ZOO.Species;

import ZOO.Animal;

import java.time.LocalDate;

public class BrownBear extends Animal {
    public BrownBear(LocalDate lastMeal) {
        super(lastMeal);
        weight=100;
    }

    public BrownBear() {
        weight=100;
    }

    public BrownBear(int weight) {
        super(weight);
    }

    @Override
    public String getName() {
        return "Brown Bear";
    }

}
