package lesson11;

public class ExtendThread {
    public static void main(String[] args) {
        new MyThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Glavni potok : " + i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("Glavni potok prervan");

        }
        System.out.println("Glavni potok zavershen");
    }
    }

