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
    protected String getName() {
        return " pluszowy";
    }
}
