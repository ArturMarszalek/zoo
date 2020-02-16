package zoo;

public class TeddyBear extends Bear {

    public TeddyBear() {
        super(null);
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void eat() {
        System.out.println("Pluszowe misie nie jedzą!");
    }

    @Override
    public String attack(Animal animal) {
        return null;
    }
}
