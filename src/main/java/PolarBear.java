import java.time.LocalDate;

public class PolarBear extends Bear {


    public PolarBear() {
        super();
        name = "Polar Bear";
        weight = 200;
    }


    public PolarBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }
}
