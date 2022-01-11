package lesson11;

public class Consumer1 implements Runnable {
    Q2 q;

    Consumer1(Q2 q) {
        this.q = q;
        new Thread(this, "Potrebitel").start();

    }

    public void run() {
        while (true) {
            q.get();
        }
    }

}
