package lesson11;

public class Q2 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Isklyuchenie tipa InterruptedException perexvacheno");
            }
        System.out.println("Polucheno: " + n);
        valueSet = false;
        notify();
        return n;

    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();

            } catch (InterruptedException e) {
                System.out.println("Isklyuchenie tipa InterruptedException perexvacheno");

            }
        this.n = n;
        valueSet = true;
        System.out.println("Otpravleno: " + n);
        notify();

    }
}
