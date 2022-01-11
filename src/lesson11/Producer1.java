package lesson11;

public class Producer1 implements Runnable {
    Q2 q;

    Producer1(Q2 q) {
        this.q = q;
        new Thread(this, "Postavshik").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }

}
