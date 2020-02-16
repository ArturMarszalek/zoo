package zoo;

import java.time.LocalDate;

public class BlackBear extends Bear {

    public BlackBear() {
        super();
    }

    public BlackBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    @Override
    public int getWeight() {
        return 50;
    }
}
