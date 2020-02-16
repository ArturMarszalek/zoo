package zoo;

public class BrownBear extends Bear {

    public BrownBear(int weight) {
        super(weight);
    }

    @Override
    public void setLastMeal(int lastMeal) {
        super.setLastMeal(lastMeal);
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
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int checkBearWeight() {
        return super.checkBearWeight();
    }
}
