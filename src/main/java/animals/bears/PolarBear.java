package animals.bears;

public class PolarBear extends Bear{
    public PolarBear() {
        setWeight(200);
    }

    @Override
    public String getName() {
        return "polarny niedźwiedż";
    }

    @Override
    public void attack(Bear target) {
        target.setWeight((int) (target.getWeight()-weight*0.5));
    }
}
