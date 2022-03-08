import java.util.Queue;
import java.util.concurrent.*;

public class Main {

    static volatile boolean cycle = true;

    public static void main(String[] args) {
        Queue<String> stringQueue = new ConcurrentLinkedQueue<>();

        new Thread(new RingGenerator(stringQueue)).start();
        new Thread(new RingProcessor(stringQueue)).start();
        new Thread(new RingProcessor(stringQueue)).start();
        new Thread(new RingProcessor(stringQueue)).start();
    }
}