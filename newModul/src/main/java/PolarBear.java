import java.time.LocalDate;

public class PolarBear extends Bear {
    public PolarBear(){
        super();
        weigth=50;
    }

    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
        weigth=50;
    }

    @Override
    public int getWeight(){
        return weigth;
    }
}
