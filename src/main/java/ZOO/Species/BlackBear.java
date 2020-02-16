package ZOO.Species;



import ZOO.Bear;

import java.time.LocalDate;

public class BlackBear extends Bear {

    public BlackBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public BlackBear() {
        super();
    }

    @Override
    protected String getName() {
        return " czarny";
    }

    public BlackBear(int weight) {
        super(weight);
    }

}
