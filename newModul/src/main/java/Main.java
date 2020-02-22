import java.time.LocalDate;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Welcome to Zoo");
        Zoo zoo = new Zoo();
        ZooTimer zooTimer = new ZooTimer(zoo);
        zooTimer.start();
        actionToBeDone(zoo);

    }
        public static void actionToBeDone(Zoo zoo) {
            System.out.println("What would you do?");
            String command = scanCommand();
            switch (command) {
                case "feed all":
                    zoo.feedAnimals();
                    break;
                case "feed polar bear":
                    zoo.feedTypeOfAnimal(new PolarBear());
                    break;
                case "feed black bear":
                    zoo.feedTypeOfAnimal(new BlackBear());
                    break;
                case "feed brown bear":
                    zoo.feedTypeOfAnimal(new BrownBear());
                    break;
                case "feed teddy bear":
                    zoo.feedTypeOfAnimal(new TeddyBear());
                    break;
                case "exit":
                    System.out.println("Good Bye");
                    System.exit(1);
                default:
                    System.out.println("Action impossible");
            }
            actionToBeDone(zoo);
        }

        private static String scanCommand() {
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
        public static class ZooTimer extends Thread{

        private Zoo zoo;
        int daysToAdd = 0;

        public ZooTimer(Zoo zoo){
            this.zoo = zoo;
        }
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LocalDate currentDay = LocalDate.now().plusDays(daysToAdd);
                System.out.println("Another day has passed " + currentDay);
                daysToAdd++;
                zoo.setCurrentDay(currentDay);
                run();
            }
        }
    }

