package animals.bears;

public class BrownBear extends Bear{

    public BrownBear() {
        setWeight(100);
    }

    @Override
    public String getName() {
        return "brązowy niedźwiedż";
    }

    @Override
    public String attack(Bear target) {
        String wynik = null;
        if (target instanceof BlackBear){wynik="uciekam od "+target.getName();}
        if (target instanceof PolarBear){wynik="zabijam "+target.getName();}
        if (target instanceof TeddyBear){wynik="oszczędzam "+target.getName();}
        return "Jestem "+getName()+" i "+wynik;
    }
}
