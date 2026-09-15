public class CountdownTimer {
    private static volatile boolean running = true;

    public static void main(String[] args) {
        Thread tickerThread = new Thread(() -> {
            while (running) {
                System.out.println("Tick...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }, "TickerThread");

        Thread countdownThread = new Thread(() -> {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Countdown: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("Countdown: Liftoff / Done!");
            running = false;
        }, "CountdownThread");

        tickerThread.start();
        countdownThread.start();

        try {
            countdownThread.join();
            tickerThread.join(600);
            if (tickerThread.isAlive()) {
                tickerThread.interrupt();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Countdown timer finished.");
    }
}
