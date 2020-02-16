package zoo;

public class BrownBear extends Bear {

    public BrownBear(int weight) {
        super(weight);
    }

    @Override
    public int getWeight() {
        return 150;
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

    @Override
    public void attack(String BearOne, String BearTwo) {
        super.attack(BearOne, BearTwo);
    }
}
