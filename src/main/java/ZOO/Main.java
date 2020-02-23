package ZOO;

import ZOO.Species.BlackBear;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        ZooTimer zooTimer = new ZooTimer(zoo);
        zooTimer.start();
        String result;
        System.out.println("Greetings in our ZOO\n" +
                "Choose your option(\n" +
                "-Feed All The Beasts\n" +
                "-Feed Black Beasts\n" +
                "-Feed Polar Beasts\n" +
                "-Feed Brown Beasts\n" +
                "-exit):");
        do {
            result = scanOperation();
            actionToBeDone(zoo, result);
        } while (!result.equals("exit"));

    }

    private static String scanOperation() {
        String result;
        Scanner scanner = new Scanner(System.in);
        result = scanner.nextLine();
        return result;
    }

    private static void actionToBeDone(Zoo zoo, String result) {
        switch (result) {
            case "exit":
                System.exit(1);
                break;
            case "Feed All The Beasts":
                zoo.feedAllTheBeast();
                System.out.println("You fed all the Beasts");
                break;
            case "Feed Black Beasts":
                zoo.feedSpecificBeast("Black Bear");
                System.out.println("You fed the Black Beasts");
                break;
            case "Feed Polar Beasts":
                zoo.feedSpecificBeast("Polar Bear");
                System.out.println("You fed the Polar Beasts");
                break;
            case "Feed Brown Beasts":
                zoo.feedSpecificBeast("Brown Bear");
                System.out.println("You fed the Brown Beasts");
                break;
            default:
                System.out.println("Incorrect action");
                break;
        }
    }

    public static class ZooTimer extends Thread {
        private Zoo zoo;
        private int daysToAdd = 0;

        public ZooTimer(Zoo zoo) {
            this.zoo = zoo;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            LocalDate currentDay = LocalDate.now().plusDays(daysToAdd);
            System.out.println("Minał kolejny dzień " + currentDay);
            daysToAdd++;
            zoo.setCurrentDay(currentDay);
            run();
        }
    }
}
