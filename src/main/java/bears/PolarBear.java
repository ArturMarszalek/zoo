package bears;

import java.time.LocalDate;

public class PolarBear extends Bear {

    public PolarBear(LocalDate lastMeal) {
        super(lastMeal);
    }

    public PolarBear() {
    }

    public PolarBear(int weight){
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
        super.eat(mealWeight);
    }

    @Override
    public String getAttack() {
        return "zabiłeś przeciwnika przeciwnika";
    }


}
