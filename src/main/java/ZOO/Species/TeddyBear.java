package ZOO.Species;

import ZOO.Bear;

import java.time.LocalDate;

public class TeddyBear extends Bear {
    public TeddyBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public TeddyBear() {
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
    public String attack(Bear target) {
        target.youAreAttacked(0);
        return "You "+target.getName()+" are hugged by "+getName();
    }

}
