package ZOO.Species;

import ZOO.Bear;

import java.time.LocalDate;

public class BronzeBear extends Bear {
    public BronzeBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public BronzeBear() {
    }

    @Override
    public String getName() {
        return " brazowy";
    }

}
