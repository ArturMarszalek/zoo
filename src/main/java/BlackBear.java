import java.time.LocalDate;

public class BlackBear extends Bear {

    public BlackBear() {
        this(null);
    }

    public BlackBear(LocalDate lastMeat) {
        super(lastMeat);
        weight = 100;
    }

}
