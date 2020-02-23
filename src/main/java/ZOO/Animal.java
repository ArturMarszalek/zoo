package ZOO;

import java.time.LocalDate;

public abstract class Animal {
    protected LocalDate lastMeal;
    protected int weight;

    public Animal(int weight) {
        this.weight = weight;
    }
    public Animal(int weight, LocalDate lastMeal) {
        this.weight = weight;
        this.lastMeal=lastMeal;
    }

    public Animal(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public Animal() {

    }

    public int getWeight() {
        return weight;
    }

    public boolean isAlive() {
        return lastMeal.isAfter((LocalDate.now().minusDays(10))) && weight > 0;
    }
   public boolean isAlive(LocalDate currentDay) {
        return lastMeal.isAfter((currentDay.minusDays(10)))&& weight > 0;
    }

    public void eat(int foodWeight) {
        lastMeal = LocalDate.now();
        weight = weight + foodWeight;
    }
    public void eat(int foodWeight, LocalDate currentDay) {
        lastMeal = currentDay;
        weight = weight + foodWeight;
    }

    public void eat() {
        lastMeal = LocalDate.now();
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public String attack(Animal target) {
        target.youAreAttacked(weight * 0.5);
        return "You " + target.getName() + " are wounded by " + getName();
    }

    public void youAreAttacked(double target) {
        weight -= target;
    }

    public String display() {
        return "I am " + getName();
    }

    public abstract String getName();

}
