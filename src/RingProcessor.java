import java.util.Queue;

class RingProcessor implements Runnable {

    private Queue<String> stringQueue;

    public RingProcessor(Queue<String> queue) {
        stringQueue = queue;
    }

    @Override
    public void run() {
        try {
            String str;
            while (Main.cycle || stringQueue.size() > 0) {
                Thread.sleep(4000);
                if ((str = stringQueue.poll()) != null) {
                    System.out.println(str + " processed");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}