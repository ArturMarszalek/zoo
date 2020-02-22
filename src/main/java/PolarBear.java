import java.time.LocalDate;

public class PolarBear extends Animal {
    public PolarBear() {
        this(null);
    }

    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
        weight = 200;
    }
}
