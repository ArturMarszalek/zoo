import java.util.List;
import java.util.Scanner;

public class MainZoo {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        System.out.println("Witaj w Zoo!");
        System.out.println("Zbiór komend znajdziesz pod spodem:");
        System.out.println("feed - karmisz wszystkie zwierzęta w całym zoo!");
        System.out.println("exit/quit - kończył działanie programu!");

        System.out.println();

        while (loop) {

            String choise = scanner.nextLine();

            switch (choise) {
                case "feed":
                    zoo.eatAllAnimals();
                    break;
                case "exit":
                    loop = false;
                    System.out.println("Program został zakończony!");
                    break;
                case "quit":
                    loop = false;
                    System.out.println("Program został zakończony!");
                    break;
                default:
                    System.out.println("Nieznana komenda!");
                    break;
            }
        }


    }

}
