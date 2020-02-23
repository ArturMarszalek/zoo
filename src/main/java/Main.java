import ZOO.Zoo;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        ZooTimer zooTimer = new ZooTimer(zoo);
        zooTimer.start();

        actionToBeDone(zoo);
    }

    public static void actionToBeDone(Zoo zoo) {
        System.out.println("What would you do?");
        int mealWeigth = 1;
        String command = scanCommand();
        switch (command) {
            case "feed all":
                zoo.feedAllAnimals();
                break;
            case "feed polar bear":
                break;
            case "feed black bear":
                break;
            case "feed brown bear":
                break;
            case "feed teddy bear":
                break;
            case "exit":
                System.exit(1);
                return;
            default:
                System.out.println("Action impossible");
        }
        actionToBeDone(zoo);
    }

    private static String scanCommand() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int putMealWeigth() {
        System.out.println("How big will be meal?");
        return Integer.parseInt(scanCommand());
    }
}
