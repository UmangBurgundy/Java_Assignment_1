import java.util.concurrent.CopyOnWriteArrayList;

public class S08_Q06_CopyOnWriteArrayListMultiThread {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Thread writer = new Thread(() -> {
            for (int i = 4; i <= 6; i++) {
                list.add(i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ignored) {}
            }
        });

        Thread reader = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                for (Integer val : list) {
                    System.out.print(val + " ");
                }
                System.out.println();
                try {
                    Thread.sleep(60);
                } catch (InterruptedException ignored) {}
            }
        });

        writer.start();
        reader.start();

        writer.join();
        reader.join();

        System.out.println("Final list: " + list);
    }
}
