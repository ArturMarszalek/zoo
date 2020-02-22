import java.time.LocalDate;

public class PlushBear extends Animal {
    public PlushBear() {
        super((LocalDate) null);
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
        return "I cant attack";
    }

    @Override
    public String attack(Animal animal) {
        return "I cant attack.";
    }
}
