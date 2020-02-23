import java.time.LocalDate;

public class BlackBear extends Animal {
    public BlackBear() {
        super();
        weigth = 200;
    }

    public BlackBear(LocalDate lastMeal) {
        super(lastMeal);
        weigth = 200;
    }

    @Override
    public double getWeight() {
        return weigth;
    }

    @Override
    public String getName() {
        return "BlackBear";
    }

    @Override
    public boolean isAlive(LocalDate currentDay) {
        return super.isAlive(currentDay);
    }
}

