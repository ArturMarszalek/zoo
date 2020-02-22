import java.time.LocalDate;

public class TeddyBear extends Bear {


    public TeddyBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public TeddyBear() {
        super();
        weight = 5;
    }

    @Override
    public String getName() {
        return "Teddy Bear";
    }

    @Override
    public String attack(Bear target) {
        return "Przytulam " + target.getName();
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public double attack2(Bear target) {
        return 0;
    }
}
