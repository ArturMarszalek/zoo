import java.time.LocalDate;

public abstract class Animal {

    private Animal animal;
    protected double weigth;
    private LocalDate lastMeal;
    protected String name;

    public Animal(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public Animal() {

    }

    public void setWeight(double weight) {
        this.weigth = weight;
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(10)) && getWeight() > 0;
    }

    public double getWeight() {
        return weigth;
    }

    public void eat() {
        lastMeal = LocalDate.now();
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

    public String attack(Animal animal) {
        animal.setWeight(animal.getWeight() - attackPower());
        return "I am the " + getName() + ". " + whatIDo() + " " + animal.getName() + ".";
    }

    public double attackPower() {
        return 0.5 * getWeight(); }

    public String whatIDo() {
        return "I am attacking";
    }

}