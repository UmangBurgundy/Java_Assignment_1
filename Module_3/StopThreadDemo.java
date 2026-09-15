class FileDownloader implements Runnable {

    private volatile boolean running = true;

    public void stopDownload() {
        this.running = false;
    }

    @Override
    public void run() {
        int chunkNumber = 1;
        System.out.println("Downloader thread started.");

        while (running && chunkNumber <= 20) {
            System.out.println("Downloading chunk " + chunkNumber + "...");
            chunkNumber++;
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Download interrupted during sleep.");
                break;
            }
        }

        if (!running) {
            System.out.println("Download gracefully stopped by user signal.");
        } else {
            System.out.println("Download completed successfully.");
        }
    }
}

public class StopThreadDemo {
    public static void main(String[] args) {
        FileDownloader downloader = new FileDownloader();
        Thread downloadThread = new Thread(downloader, "Downloader-Thread");

        downloadThread.start();

        try {

            Thread.sleep(1800);
            System.out.println("\n[Main Thread] Stop signal triggered (setting stop flag = false)...");
            downloader.stopDownload();

            downloadThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("[Main Thread] Program finished.");
    }
}
