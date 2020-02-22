import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Animal {
    HashMap<String, ArrayList<Animal>> animals = new HashMap<>();

    public Animal(HashMap<String, ArrayList<Animal>> animals){
        this.animals=animals;
        animals.put("polar", new ArrayList<>());
    }

    private Animal animal;
    protected double weigth;
    private LocalDate lastMeal;
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
