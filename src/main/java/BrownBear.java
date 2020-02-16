import java.time.LocalDate;

public class BrownBear extends Bear {

    @Override
    public String getName() {
        return "brazowy";
    }

    @Override
    public String attack(Bear target) {
        return "Ja " + getName() + " zabijam " + target.getName();
    }

    public BrownBear() {
        this(null);
    }

    public BrownBear(LocalDate lastMeat) {
        super(lastMeat);
        weight = 150;
    }

}
