package animals.bears;

public class BlackBear extends Bear{

    public BlackBear() {
        setWeight(50);
    }

    @Override
    public void display() {
        System.out.println("To jest Czarny miś");
    }
}
