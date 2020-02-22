package zoo;

public class TeddyBear extends Bear {
    public TeddyBear(int weight) {
        super(weight);
    }

    @Override
    public int getWeight() {
        return 200;
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public void setLastMeal(int lastMeal) {
        super.setLastMeal(lastMeal);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean feedBear(String foodtype, int foodWeight) {
        return super.feedBear(foodtype, foodWeight);
    }

    @Override
    boolean isItStillAlive() {
        return super.isItStillAlive();
    }

    @Override
    public String display() {
        return super.display();
    }
}
