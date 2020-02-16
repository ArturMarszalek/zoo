import java.time.LocalDate;

public class TeddyBear extends Bear {


    public TeddyBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String attack(Bear target) {
        return null;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void eat(){
    }
}
