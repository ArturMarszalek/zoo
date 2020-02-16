import java.time.LocalDate;

public class PolarBear extends Bear {

    @Override
    public String getName() {
        return "polarny";
    }

    @Override
    public String attack(Bear target) {
        return "Ja " + getName() + " sciskam " + target.getName();
    }

    public PolarBear() {
        this(null);
    }

    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
        weight = 200;
    }
}
