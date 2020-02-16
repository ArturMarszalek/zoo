package zoo;

import java.time.LocalDate;
import java.util.Date;

public class Animal {

    private LocalDate lastMeal;
    private boolean canDisplay;
    private boolean isAlive;

    public Animal() {
        this.lastMeal = LocalDate.now();
        this.canDisplay = true;
        this.isAlive = true;
    }

    public Animal(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
        this.isAlive = true;
    }

    public boolean isAlive() {

        if (!isAlive) {
            return false;
        }
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }

    public void eat() {
        this.lastMeal = LocalDate.now();
    }

    public void die() {
        this.isAlive = false;
    }

    public int getWeight() {
        return 0;
    }

    public boolean canDisplay() {
        return canDisplay;
    }

    public String attack(Animal animal) {
        return "Niedźwieź został atakowany";
    }

    public LocalDate whenAte() {
        return lastMeal;
    }

}
