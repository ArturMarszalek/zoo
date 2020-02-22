package animals.bears;

import java.time.Period;
import java.time.ZonedDateTime;

public abstract class Animal extends animals.Animal {

    ZonedDateTime lastMeal;
    int weight;

    public Animal(ZonedDateTime lastEatingTime) {
        this();
        this.lastMeal = lastEatingTime;
    }

    public Animal() {
    }

    public void getEating(){

        lastMeal = ZonedDateTime.now();
        weight+=5;

    }

    public boolean isAlive(){
        ZonedDateTime actualTime = ZonedDateTime.now();
        if (actualTime.minus(Period.ofDays(10)).isAfter(lastMeal) || weight<=0){
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

    public String display(){
        return "Jestem "+getName();
    }

    public abstract String getName();

    public abstract void attack(Animal target);

}
