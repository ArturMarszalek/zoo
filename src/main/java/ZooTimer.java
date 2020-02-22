public class ZooTimer implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println();
            this.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
