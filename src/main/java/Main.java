import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        actionToBeDone();

    }

    public static void actionToBeDone() {
        System.out.println("What would you do?");
        int mealWeigth = 1;
        Zoo zoo = new Zoo();
        String command = scanCommand();
        switch (command) {
            case "feed all":
               zoo.feedAllAnimals(mealWeigth);
                break;

            case "feed polar bear":
                zoo.feedOneTypeOfAnimal(new PolarBear(),putMealWeigth());
                break;

            case "feed black bear":
                zoo.feedOneTypeOfAnimal(new BlackBear(),putMealWeigth());
                break;

            case "feed brown bear":
                zoo.feedOneTypeOfAnimal(new BrownBear(),putMealWeigth());
                break;

            case "feed teddy bear":
                zoo.feedOneTypeOfAnimal(new TeddyBear(),putMealWeigth());
                break;
            case "exit":
                return;
            default:
                System.out.println("Action impossible");

        }
        actionToBeDone();
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
