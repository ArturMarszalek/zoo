public class TeddyBear extends Bear {
    public TeddyBear() {
        super(null);
        weigth = 10;
    }

    @Override
    public void eat() {

    }

    @Override
    public void eat(int weigth) {

    }

    @Override
    public String getName() {
        return "PlushBear";
    }

    @Override
    public String whatIDo() {
        return "I cant attack";
    }

    @Override
    public String attack(Bear bear) {
        return "I cant attack.";
    }
}
