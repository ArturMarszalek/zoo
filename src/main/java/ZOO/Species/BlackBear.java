package ZOO.Species;



import ZOO.Animal;

import java.time.LocalDate;

public class BlackBear extends Animal {

    public BlackBear(LocalDate lastMeal) {
        super(lastMeal);
        weight=200;
    }

    public BlackBear() {
        weight=200;
    }

    @Override
    public String getName() {
        return "Black Bear";
    }

    public BlackBear(int weight) {
        super(weight);
    }

}
