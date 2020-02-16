package ZOO.Species;



import ZOO.Bear;

import java.time.LocalDate;

public class BlackBear extends Bear {

    public BlackBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public BlackBear() {

    }

    @Override
    public String getName() {
        return "Black Bear";
    }

    public BlackBear(int weight) {
        super(weight);
    }

}
