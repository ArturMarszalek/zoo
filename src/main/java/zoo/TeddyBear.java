package zoo;

public class TeddyBear extends Bear {
    public TeddyBear(int weight) {
        super(weight);
    }

    @Override
    public boolean feedBear(String foodtype, int foodWeight) {
        return super.feedBear(foodtype, foodWeight);
    }

    @Override
    boolean isItStillAlive() {
        return false;
    }
}
