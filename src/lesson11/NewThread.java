package lesson11;

public class NewThread implements Runnable {
    Thread t;
    NewThread() {
        t = new Thread(this, "Demonstracioni potok");
        System.out.println("Docherni potok sozdan : " + t);
        t.start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Docherni potok : " + i);
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            System.out.println("Docherni potok zavershen");

        }
        System.out.println("Glavni potok zavershen");
    }

}
