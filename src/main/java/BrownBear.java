import java.time.LocalDate;

public class BrownBear extends Animal {
    public BrownBear() {
        super();
        weigth = 100;
    }

    public BrownBear(LocalDate lastMeal) {
        super(lastMeal);
        weigth = 100;
    }

    @Override
    public double getWeight() {
        return weigth;
    }

    @Override
    public String getName() {
        return "BrownBear";
    }
}
