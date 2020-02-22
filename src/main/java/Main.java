import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        System.out.println("Co byś chciał zrobić mordo?");
        System.out.println("Wybierz: \n 1: Nakarm Czarnulca \n 2: Nakarm Polarnego \n 3: Nakarm Bronzusia \n 4: Nakarm pluszaka \n 5: Nakarm wszystkich" +
                "\n 6: Wyjdz");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            switch (scanner.nextLine()) {
                case "1":
                    zoo.feedBlackBear();
                    System.out.println("Nakarmiono " + zoo.animals.get(0).getName());
                    break;
                case "2":
                    zoo.animals.get(2).eat();
                    System.out.println("Nakarmiono " + zoo.animals.get(2).getName());
                    break;
                case "3":
                    zoo.animals.get(4).eat();
                    System.out.println("Nakarmiono " + zoo.animals.get(4).getName());
                    break;
                case "4":
                    zoo.animals.get(8).eat();
                    System.out.println("Nie można karmić " + zoo.animals.get(8).getName());
                    break;
                case "5":
                    zoo.feedAll();
                    System.out.println("Nakarmiono wszystkie szczury");
                    break;
                case "6":
                    System.exit(1);
                    break;
            }
        }
    }
}
