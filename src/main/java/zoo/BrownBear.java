package zoo;

import java.time.LocalDate;

public class BrownBear extends Bear {

    public BrownBear() {
        super();
    }

    public BrownBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    @Override
    public int getWeight() {
        return 100;
    }
}
