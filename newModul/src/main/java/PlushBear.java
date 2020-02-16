import java.time.LocalDate;

public class PlushBear extends Bear {
    public PlushBear() {
        super(null);
        weigth = 10;
    }

    @Override
    public void eat() {

    }

    @Override
    public void eat(int weigth) {

    }

    @Override
    public String getName() {
        return "Plushbear";
    }

    @Override
    public String whatIDo() {
        return null;
    }

    @Override
    public String attack(Bear bear) {
        return "I cant attack.";
    }
}
