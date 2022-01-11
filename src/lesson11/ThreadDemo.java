package lesson11;


public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("glavni potok : " + i);
                Thread.sleep(1000);


            }
        } catch (InterruptedException e) {
            System.out.println("Glavni potok prervan");
        }
        System.out.println("glavni potok zavershen");
    }
}
