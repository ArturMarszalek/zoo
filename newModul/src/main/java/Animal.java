import java.time.LocalDate;

public abstract class Animal {


    private Animal bear;
    protected double weigth;
    protected LocalDate lastMeal;

    protected String name;

    public Animal() {

    }

    public Animal(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public void setWeight(double weight) {
        this.weigth = weight;
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public void setLastMeal(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public boolean isAlive(LocalDate currentDay) {
        return lastMeal.isAfter(currentDay.minusDays(10));
    }

    public double getWeight() {
        return weigth;
    }

    public void eat(LocalDate currentDay) {
        setLastMeal(currentDay);
        System.out.println("I " + getName() + " was feeded on: " + getLastMeal());
    }

    public void eat(int mealWeigth) {
        weigth += mealWeigth;
    }

    public String diplay() {
        return "I am the " + getName() + " with weigth " + weigth + ". My last meal was " + lastMeal;
    }

    public abstract String getName();

    public String displayAttack() {
        return "I am the " + getName() + ". " + whatIDo();
    }

    public String attack(Animal bear) {
        bear.setWeight(bear.getWeight() - attackPower());
        return "I am the " + getName() + ". " + whatIDo() + " " + bear.getName() + ".";
    }

    public double attackPower() {
        return 0.5 * getWeight(); }

    public String whatIDo() {
        return "I am attacking";
    }


}
