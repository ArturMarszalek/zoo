import java.time.LocalDate;

public class Animal {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected LocalDate lastMeal;
    protected int weight;

    public Animal() {
        this(null);
    }
    public Animal(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }

    public void eat(int mealWeight) {
        weight += mealWeight;
        lastMeal = LocalDate.now();
    }

    public int getWeight() {
        return weight;
    }
}
