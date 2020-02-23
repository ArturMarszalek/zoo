package ZOO.Species;



import ZOO.Animal;

import java.time.LocalDate;

public class BlackBear extends Animal {

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

    public BlackBear(int weight, LocalDate lastMeal) {
        super(weight, lastMeal);
    }
}
