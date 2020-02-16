package animals.bears;

import animals.Animal;
import java.time.Period;
import java.time.ZonedDateTime;

public class Bear extends Animal {

    ZonedDateTime lastMeal;
    int weight;

    public Bear(ZonedDateTime lastEatingTime) {
        this();
        this.lastMeal = lastEatingTime;
    }

    public Bear() {
    }

    public void getEating(){

        lastMeal = ZonedDateTime.now();
        weight+=5;

    }

    public boolean isAlive(){
        ZonedDateTime actualTime = ZonedDateTime.now();
        if (actualTime.minus(Period.ofDays(10)).isAfter(lastMeal)){
            return false;
        }
        return true;
    }

    public ZonedDateTime getLastMeal() {
        return lastMeal;
    }

    public void setLastMeal(ZonedDateTime lastMeal) {
        this.lastMeal = lastMeal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void display(){
        System.out.println("To są wszystkie misie");
    }
}
