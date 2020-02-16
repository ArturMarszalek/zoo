import java.time.LocalDate;

public class BlackBear extends Bear {
    public BlackBear(){
        super();
        weigth=200;
    }

    public BlackBear(LocalDate lastMeal) {
        super(lastMeal);
        weigth=200;
    }

    @Override
    public int getWeight(){
        return weigth;
    }
}
