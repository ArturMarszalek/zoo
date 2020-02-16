package animals.bears;

public class PolarBear extends Bear{
    public PolarBear() {
        setWeight(200);
    }

    @Override
    public void display() {
        System.out.println("To jest Polarny miś");
    }

}
