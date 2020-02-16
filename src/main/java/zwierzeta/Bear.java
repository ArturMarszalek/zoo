package zwierzeta;

import java.time.LocalDate;

public abstract class Bear {

    private  LocalDate mealTime;

    public boolean isAlive(){
        return mealTime.isAfter(LocalDate.now().minusDays(10));
    }


    public  void eat() {
        mealTime = LocalDate.now();
    }


    public LocalDate getMealTime() {
        return mealTime;
    }
}
