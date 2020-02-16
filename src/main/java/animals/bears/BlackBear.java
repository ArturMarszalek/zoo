package animals.bears;

public class BlackBear extends Bear{

    public BlackBear() {
        setWeight(50);
    }

    @Override
    public String getName() {
        return "czarny niedźwiedż";
    }

    @Override
    public String attack(Bear target) {
        String wynik = null;
        if (target instanceof BrownBear){wynik="uciekam od "+target.getName();}
        if (target instanceof PolarBear){wynik="zabijam "+target.getName();}
        if (target instanceof TeddyBear){wynik="oszczędzam "+target.getName();}
        return "Jestem "+getName()+" i "+wynik;
    }
}
