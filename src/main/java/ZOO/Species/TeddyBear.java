package ZOO.Species;

import ZOO.Bear;

import java.time.LocalDate;

public class TeddyBear extends Bear {
    public TeddyBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public TeddyBear() {
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
        return " pluszowy";
    }

    @Override
    public String attack(Bear target) {
        return "You"+target.getName()+" are hugged by"+getName();
    }

}
