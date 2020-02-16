import java.time.LocalDate;

public class Blackbear extends Bear {


    public Blackbear() {
        super();
        name = "Black Bear";
        weight = 50;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Blackbear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }
}
