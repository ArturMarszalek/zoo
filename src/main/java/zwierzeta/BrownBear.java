package zwierzeta;


import java.time.LocalDate;

public class BrownBear extends Animal {
    public BrownBear() {
        super();
        weight = 100;
    }


    public BrownBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    public String Attack(Animal bear) {
        return "Ja " + getName() + " atakuje" + bear.getName();
    }

    @Override
    protected String getName() {
        return "Brunatnym";
    }
}
