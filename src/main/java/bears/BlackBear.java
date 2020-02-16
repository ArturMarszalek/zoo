package bears;

import java.time.LocalDate;

public class BlackBear extends Bear {

    public BlackBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public BlackBear() {
    }

    public BlackBear(int weight){
        super(weight);
    }

    @Override
    public int getWeight() {
        return weight;
    }
    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public void eat(int mealWeight) {
        weight += mealWeight;
    }

    @Override
    public String getAttack() {
        return "zraniłeś przeciwnika";
    }
}
