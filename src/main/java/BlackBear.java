import java.time.LocalDate;

public class BlackBear extends Bear {
    @Override
    public String getName() {
        return "czarny";
    }

    @Override
    public String attack(Bear target) {
        return "Ja " + getName() + " zabijam " + target.getName();
    }



    public BlackBear() {
        this(null);
    }

    public BlackBear(LocalDate lastMeat) {
        super(lastMeat);
        weight = 100;
    }

}
