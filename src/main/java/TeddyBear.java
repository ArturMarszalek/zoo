

public class TeddyBear extends Bear {

    @Override
    public String getName() {
        return "pluszowy";
    }

    @Override
    public String attack(Bear target) {
        return "Ja " + getName() + " glaszcze " + target.getName();
    }

    public TeddyBear() {
        super(null);
        weight = 5;
    }

    @Override
    public void eat(int mealWeight) {

    }
}
