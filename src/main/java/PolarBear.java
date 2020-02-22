import java.time.LocalDate;

public class PolarBear extends Bear {


    public PolarBear() {
        super();
        weight = 200;
    }


    public PolarBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    public String getName() {
        return "Polar Bear";
    }

    @Override
    public String attack(Bear target) {
        return getName() + " Zabija " + target.getName();
    }

    @Override
    public double attack2(Bear target) {
        return (target.getWeight() - (getWeight() * 0.5));
    }
}
