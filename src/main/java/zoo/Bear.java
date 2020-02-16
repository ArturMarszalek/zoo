package zoo;

import java.time.LocalDate;

public abstract class Bear {

    private boolean lastMeal = false;

    boolean isItStillAlive() {
        return lastMeal;
    }

    public boolean feedBear(String foodtype) {
        LocalDate feedTime = LocalDate.now();
        lastMeal = true;
        System.out.println("Jem " + foodtype + " nie przeszkadzaj!");
        return true;
    }

}
