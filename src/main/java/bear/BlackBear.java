package bear;


import java.time.LocalDate;

public class BlackBear extends Animals {

    public BlackBear() {
        super();
        weight = 50;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BlackBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    public String Attack(Animals bear) {
        return "Ja " + getName() + " zatakuje " + bear.getName();
    }

    @Override
    protected String getName() {
        return "Czarnym";
    }

}