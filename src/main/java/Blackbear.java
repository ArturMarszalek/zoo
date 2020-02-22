import java.time.LocalDate;

public class Blackbear extends Bear {


    public Blackbear() {
        super();
        weight = 50;
    }

    public Blackbear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    public String getName() {
        return "Black Bear";
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
