import java.time.LocalDate;

public class BrownBear extends Animal {

    public BrownBear() {
        this(null);
    }

    public BrownBear(LocalDate lastMeat) {
        super(lastMeat);
        weight = 150;
    }

    @Override
    public void eat(int mealWeight) {
        System.out.println("Brown Bear was feeded");
    }

    @Override
    public String getName() {
        return "BrownBear";
    }

}
