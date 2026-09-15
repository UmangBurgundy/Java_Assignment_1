public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread autoSaveThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                    System.out.println("[Daemon Thread] Auto-Save in progress...");
                } catch (InterruptedException e) {
                    System.out.println("[Daemon Thread] Interrupted.");
                    break;
                }
            }
        }, "AutoSaveDaemon");

        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        System.out.println("[Main Thread] Starting file processing task...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("[Main Thread] Processing file chunk " + i + "/5...");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("[Main Thread] File processing complete! Main thread exiting...");

    }
}
