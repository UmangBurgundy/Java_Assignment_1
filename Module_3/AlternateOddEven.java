class NumberPrinter {
    private int currentNumber = 1;
    private final int maxNumber;

    public NumberPrinter(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public synchronized void printOdd() {
        while (currentNumber <= maxNumber) {

            while (currentNumber % 2 == 0 && currentNumber <= maxNumber) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (currentNumber <= maxNumber) {
                System.out.println(Thread.currentThread().getName() + " (Odd) : " + currentNumber);
                currentNumber++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (currentNumber <= maxNumber) {

            while (currentNumber % 2 != 0 && currentNumber <= maxNumber) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            if (currentNumber <= maxNumber) {
                System.out.println(Thread.currentThread().getName() + " (Even): " + currentNumber);
                currentNumber++;
                notify();
            }
        }
    }
}

public class AlternateOddEven {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter(20);

        Thread oddThread = new Thread(printer::printOdd, "Thread-1");
        Thread evenThread = new Thread(printer::printEven, "Thread-2");

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Finished printing alternating numbers 1 to 20.");
    }
}
