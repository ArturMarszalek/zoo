import java.time.LocalDate;

public class PolarBear extends Animal {
    public PolarBear() {
        this(null);
    }

    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
        weight = 200;
    }

    @Override
    public void eat(int mealWeight) {
        System.out.println("Polar Bear was feeded");
    }

    @Override
    public String getName() {
        return "PolarBear";
    }
}
