import animals.Zoo;
import animals.bears.Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isExit = false;
        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);
        while (!isExit) {
            System.out.println("Wpisz komende (nakarm, nakarm:kogo?, exit) : ");
            String command = scanner.nextLine().trim();
            String[] commandSplit = command.split(":");
            if (commandSplit.length > 1) {
                command = "nakarm jeden rodzaj";
            }
            switch (command) {
                case "nakarm":
                    zoo.feedAnimals();
                    break;
                case "nakarm jeden rodzaj":
                    zoo.feedOneSpecies(zoo, commandSplit);
                    break;
                case "exit":
                    isExit = true;
                    break;
            }
        }

    }


}
