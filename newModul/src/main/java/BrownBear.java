import java.time.LocalDate;

public class BrownBear extends Bear {
    public BrownBear(){
        super();
        weigth=100;
    }

    public BrownBear(LocalDate lastMeal) {
        super(lastMeal);
        weigth=100;
    }

    @Override
    public int getWeight(){
        return weigth;
    }

}
