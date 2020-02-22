import java.time.LocalDate;

public class PolarBear extends Animal {
    public PolarBear() {
        super();
        weigth = 50;
    }

    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
        weigth = 50;
    }

    @Override
    public double getWeight() {
        return weigth;
    }

    @Override
    public String getName() {
        return "Polarbear";
    }

    @Override
    public String whatIDo() {
        return "I am killing";
    }

    @Override
    public double attackPower() {
        return 1000000000 * getWeight();
    }
}
