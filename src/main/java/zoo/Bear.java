package zoo;

import java.time.LocalDate;

public abstract class Bear {

    int weight;
    int lastMeal;
    int ifAlive = LocalDate.now().minusDays(10).getDayOfYear();
    int feedingDate = 0;
    int meal;


    public Bear(int weight) {
        this.weight = weight;
    }

    public void setLastMeal(int lastMeal) {
        this.lastMeal = lastMeal;
    }

    public boolean feedBear(String foodtype, int foodWeight) {
        weight = getWeight()+foodWeight;
        int feedTime = LocalDate.now().getDayOfYear();
        lastMeal = feedTime;
        System.out.println("Jem " + foodtype + " nie przeszkadzaj!");
        feedingDate = feedTime;
        meal = foodWeight;
        return true;
    }

    boolean isItStillAlive() {
        return lastMeal >= ifAlive;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int checkBearWeight(){
        return getWeight()+meal;
    }

    public String getName(){

        String name = getClass().getName();
        String[] s = name.split("\\.");
        return s[s.length -1];
    }

    public String display(){
        System.out.println("Mój gatunek to: " + getName());
        return getName();
    }

    public void attack(String BearOne, String BearTwo){
        System.out.println(BearOne + " has attacked " + BearTwo);
    }

}
