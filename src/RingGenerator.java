import java.util.Queue;

class RingGenerator implements Runnable {

    private Queue<String> stringQueue;

    public RingGenerator(Queue<String> queue) {
        stringQueue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 61; i++) {
                String ring = "Ring " + i;
                stringQueue.add(ring);
                Thread.sleep(1000);
            }
            Main.cycle = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}