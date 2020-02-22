import java.time.LocalDate;

public class BlackBear extends Animal {

    public BlackBear() {
        this(null);
    }

    public BlackBear(LocalDate lastMeat) {
        super(lastMeat);
        weight = 100;
    }
    @Override
    public void eat(int mealWeight) {
        System.out.println("Black Bear was feeded");
    }
    @Override
    public String getName() {
        return "BlackBear";
    }

}
