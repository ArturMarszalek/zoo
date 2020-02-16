package zoo;

import java.time.LocalDate;

public abstract class Bear {

    int lastMeal;
    int ifAlive = LocalDate.now().minusDays(10).getDayOfYear();

    public void setLastMeal(int lastMeal) {
        this.lastMeal = lastMeal;
    }

    public boolean feedBear(String foodtype) {
        int feedTime = LocalDate.now().getDayOfYear();
        lastMeal = feedTime;
        System.out.println("Jem " + foodtype + " nie przeszkadzaj!");
        return true;
    }

    boolean isItStillAlive() {
        return lastMeal >= ifAlive;
    }
}
