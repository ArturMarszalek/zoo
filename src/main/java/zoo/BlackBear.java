package zoo;

public class BlackBear extends Bear {

    public BlackBear(int weight) {
        super(weight);
    }

    @Override
    public int getWeight() {
        return 100;
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
    public String getName() {
        return super.getName();
    }

    @Override
    public int attackPower() {
        return super.attackPower();
    }
}
