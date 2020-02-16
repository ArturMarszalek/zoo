import java.time.LocalDate;

public abstract class Bear {
    protected int weigth;
    private LocalDate lastMeal;
    protected String name;

    public Bear() {

    }

    public Bear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public void setWeight(int weight) {
        this.weigth = weight;
    }

    public LocalDate getLastMeal() {
        return lastMeal;
    }

    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }

    public int getWeight() {
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

    public String attack(Bear bear) {
        return "I am the " + getName() + ". " + whatIDo() + " " + bear.getName() + ".";
    }

    public String whatIDo() {
        return "I am attacking";
    }

}
