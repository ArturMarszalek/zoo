package animals.bears;

public class BrownBear extends Animal {

    public BrownBear() {
        setWeight(100);
    }

    @Override
    public String getName() {
        return "brązowy niedźwiedż";
    }

    @Override
    public void attack(Animal target) {
        target.setWeight((int) (target.getWeight()-weight*0.5));

    }
}
