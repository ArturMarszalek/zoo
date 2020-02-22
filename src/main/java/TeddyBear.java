

public class TeddyBear extends Animal {
    public TeddyBear() {
        super(null);
        weight = 5;
    }

    @Override
    public void eat(int mealWeight) {
        System.out.println("Teddy Bear was feeded");
    }

    @Override
    public String getName() {
        return "TeddyBear";
    }
}
