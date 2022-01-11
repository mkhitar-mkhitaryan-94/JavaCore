package lesson11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread x = Thread.currentThread();
        System.out.println("Tekushi potok ispolneniya: " + x);

        x.setName("My Thread");
        System.out.println("Posle izmeneiya imeni potoka: " + x);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("Glavni potok ispolneniya prervan");
        }
    }
}
