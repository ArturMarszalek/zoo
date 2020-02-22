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
                    for (Animal animal : zoo.getAnimals()) {

                        if (animal.isAlive()) {
                            animal.getEating();
                        }
                    }
                    break;
                case "nakarm jeden rodzaj":
                    for (Animal animal : zoo.getAnimals()) {
                        if (animal.getName().equals(commandSplit[1]) && animal.isAlive()) {
                            animal.getEating();
                        }
                    }
                    break;
                case "exit":
                    isExit = true;
                    break;

            }
        }

    }
}
