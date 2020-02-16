import java.time.LocalDate;

public class PolarBear extends Bear {


    public PolarBear() {
        super();
        weight = 200;
    }


    public PolarBear(LocalDate lastMeal) {
        this.lastMeal = lastMeal;
    }

    @Override
    public String getName() {
        return "Polar Bear";
    }

    @Override
    public String attack() {
        return "Nie masz szczescia, zostales zabity przez polarnego niedzwiedzia!";
    }
}
