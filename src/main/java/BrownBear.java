import java.time.LocalDate;

public class BrownBear extends Bear {


    public BrownBear() {
        super();
        weight = 100;
    }


    public BrownBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    public String getName() {
        return "Brown Bear";
    }

    @Override
    public String attack(Bear target) {
        return "Atakuje " + target.getName();
    }

    @Override
    public double attack2(Bear target) {
        return 0;
    }
}
