package zoo;

import java.time.LocalDate;

public class PolarBear extends Bear {

    public PolarBear() {
        super();
    }

    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    @Override
    public int getWeight() {
        return 200;
    }

    @Override
    public String attack(Animal animal) {
        animal.die();
        return "Niedźwieź został zabity!";
    }
}
