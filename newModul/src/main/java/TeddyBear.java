import java.time.LocalDate;

public class TeddyBear extends Animal {
    public TeddyBear() {
        super(null);
        weigth = 10;
    }

    @Override
    public boolean isAlive(LocalDate currentDay) {
        return false;
    }

    @Override
    public void eat(LocalDate currentDay) {
        System.out.println("Teddy Bears don't eat!");
    }

    @Override
    public void eat(int weigth) {

    }

    @Override
    public String getName() {
        return "TeddyBear";
    }

    @Override
    public String whatIDo() {
        return "I cant attack";
    }

    @Override
    public String attack(Animal bear) {
        return "I cant attack.";
    }
}
