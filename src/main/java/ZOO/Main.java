package ZOO;

import ZOO.Species.BlackBear;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Greetings in our ZOO\nChoose your option: ");

        switch (scanner.nextLine()) {
            case "exit":
                break;
            case "Feed Black Bear":
                zoo.listOfAllAnimals.get(0).eat();
            case "Feed Polar Bear":
                zoo.listOfAllAnimals.get(2).eat();
            case "Feed Brown Bear":
                zoo.listOfAllAnimals.get(0).eat();
            case "Feed Teddy Bear":
                zoo.listOfAllAnimals.get(0).eat();

        }
    }


}
