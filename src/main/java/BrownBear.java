import java.time.LocalDate;

public class BrownBear extends Animal {

    public BrownBear() {
        this(null);
    }

    public BrownBear(LocalDate lastMeat) {
        super(lastMeat);
        weight = 150;
    }

}
