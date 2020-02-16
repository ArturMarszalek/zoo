package zwierzeta;


import java.time.LocalDate;

public class PolarBear extends Bear {
    public PolarBear(){
        super();
        weight = 200;
    }

    public PolarBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    protected String getName() {
        return "Polarnym";
    }
}
