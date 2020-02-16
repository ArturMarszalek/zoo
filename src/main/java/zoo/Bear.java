package zoo;

public abstract class Bear {

    private boolean lastMeal;

    boolean isItStillAlive() {
        if(lastMeal == true){
            return true;
        }
        return false;
    }

    public boolean feedBear(String foodtype) {
        lastMeal = true;
        System.out.println("Jem " + foodtype + " nie przeszkadzaj!");
        return true;
    }

}
