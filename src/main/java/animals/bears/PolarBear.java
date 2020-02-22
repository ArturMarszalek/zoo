package animals.bears;

public class PolarBear extends Animal {
    public PolarBear() {
        setWeight(200);
    }

    @Override
    public String getName() {
        return "polarny niedźwiedż";
    }

    @Override
    public void attack(Animal target) {
        target.setWeight((int) (target.getWeight()-weight*0.5));
    }
}
