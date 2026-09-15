// 9.1 Using wait(), notify(), and notifyAll()
// Producer-consumer scenario where one thread produces data and another consumes it
// using wait() and notify() methods for synchronization.

import java.util.LinkedList;
import java.util.Queue;

class DataBuffer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 3;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            System.out.println("[Producer] Buffer full (size=" + queue.size() + "). Waiting for consumer...");
            wait();
        }

        queue.add(value);
        System.out.println("[Producer] Produced: " + value + " | Buffer size: " + queue.size());
        notify(); // Notify waiting consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("[Consumer] Buffer empty. Waiting for producer...");
            wait();
        }

        int val = queue.poll();
        System.out.println("[Consumer] Consumed: " + val + " | Buffer size: " + queue.size());
        notify(); // Notify waiting producer
        return val;
    }
}

public class ProducerConsumerWaitNotify {
    public static void main(String[] args) {
        DataBuffer buffer = new DataBuffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 6; i++) {
                    buffer.produce(i * 10);
                    Thread.sleep(150);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "ProducerThread");

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 6; i++) {
                    buffer.consume();
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "ConsumerThread");

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Producer-Consumer processing completed.");
    }
}
