package ZOO.Species;

import ZOO.Animal;

import java.time.LocalDate;

public class PolarBear extends Animal {
    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
        weight=50;
    }

    public PolarBear() {
        weight=50;
    }

    public PolarBear(int weight) {
        super(weight);
    }

    @Override
    public String attack(Animal target) {
        target.youAreAttacked(target.getWeight());
        return "You "+target.getName()+" are killed by "+getName();
    }

    @Override
    public String getName() {
        return "Polar Bear";
    }

}
