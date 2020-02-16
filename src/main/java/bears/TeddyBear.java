package bears;

import java.time.LocalDate;

public class TeddyBear extends Bear {

    public TeddyBear(LocalDate lastMeal) {
        super(null);
    }

    public TeddyBear() {

    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void eat(int mealWeight) {
        dateOfMeal = null;
        weight = 5;
    }

    @Override
    public LocalDate getDateOfMeal() {
        return null;
    }

    public TeddyBear(int weight) {
        super(weight);
    }

    @Override
    public int getWeight() {
        return weight = 5;
    }

    @Override
    public String getAttack() {
        return "gówno zrobiłeś bo jesteś pluszakiem";
    }
}
