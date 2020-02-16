package ZOO;

import java.time.LocalDate;

public abstract class Bear {
    protected LocalDate lastMeal;
    protected int weight;

    public Bear(int weight) {
        this.weight = weight;
    }

    public Bear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public Bear() {

    }

    public int getWeight() {
        return weight;
    }

    public boolean isAlive() {
        return lastMeal.isAfter((LocalDate.now().minusDays(10))) && weight>0;
    }

    public void eat(int foodWeight) {
        lastMeal = LocalDate.now();
        weight = weight + foodWeight;
    }
    public void eat() {
        lastMeal = LocalDate.now();
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public String attack(Bear target) {
        target.weight-=weight*0.5;
        return "You "+target.getName()+" are wounded by "+getName();
    }

    public String display(){
        return "I am " + getName();
    }

    public abstract String getName();

}
