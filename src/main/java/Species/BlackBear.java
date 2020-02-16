package Species;



import java.time.LocalDate;

public class BlackBear extends Bear {
    protected LocalDate lastMeal;

    public BlackBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public BlackBear() {
        super();
    }
}
