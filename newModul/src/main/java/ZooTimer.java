import java.time.LocalDate;


    public class ZooTimer extends Thread{

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
            zoo.onDateChangeHandler(currentDay);
            run();
        }
    }

