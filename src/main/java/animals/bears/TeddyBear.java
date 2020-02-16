package animals.bears;

import java.time.ZonedDateTime;

public class TeddyBear extends Bear{

    public TeddyBear() {
        setWeight(5);
    }

    @Override
    public void getEating() {
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public ZonedDateTime getLastMeal() {
        return lastMeal;
    }

    @Override
    public void setLastMeal(ZonedDateTime lastMeal) {

    }

    @Override
    public String getName() {
        return "pluszak";
    }

    @Override
    public String attack(Bear target) {
        return "Jestem bezbronnym nie agresywnym pluszakiem";
}
}
