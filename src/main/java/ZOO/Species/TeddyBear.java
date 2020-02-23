package ZOO.Species;

import ZOO.Animal;

import java.time.LocalDate;

public class TeddyBear extends Animal {
    public TeddyBear(LocalDate lastMeal) {
        super(lastMeal);
        weight=20;
    }

    public TeddyBear() {
        weight=20;
    }

    public TeddyBear(int weight) {
        super(weight);
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void eat() {
    }

    @Override
    public String getName() {
        return "Teddy Bear";
    }

    @Override
    public String attack(Animal target) {
        target.youAreAttacked(0);
        return "You "+target.getName()+" are hugged by "+getName();
    }

}
