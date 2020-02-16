package bears;

import java.time.LocalDate;

public class BrownBear extends Bear {

    public BrownBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public BrownBear() {
    }

    public BrownBear(int weight){
        super(weight);
    }

    @Override
    public int getWeight() {
        return (150);
    }

    @Override
    public String getAttack() {
        return "zraniłeś przeciwnika";
    }

}
