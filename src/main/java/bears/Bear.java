package bears;

import org.joda.time.DateTime;

import java.time.LocalDate;

public class Bear {

    protected int weight;
    protected String name;
    protected LocalDate lastMeal;
    protected LocalDate dateOfMeal;
    protected String attack;

    public Bear(){
    }
    public Bear(LocalDate lastMeal){
        this.lastMeal = lastMeal;
    }
    public boolean isAlive() {
        return lastMeal.isAfter(LocalDate.now().minusDays(10));
    }

    public void eat(int mealWeight) {
        weight += mealWeight;
    }

    public void eat() {
        dateOfMeal = LocalDate.now();
    }

    public LocalDate getDateOfMeal() {
        return dateOfMeal;
    }

    public Bear(int weight){
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String display(){
        return "Jestem: " + getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String attack(){
        return "Zaatakowałeś i " + getAttack();
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }
}
