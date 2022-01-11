package lesson11;

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Glavni potok");
        Thread t = new Thread(this, "Sopernichayushi potok");
        t.start();

        a.foo(b);
        System.out.println("Nazad v glavni potok ");
    }

    public void run() {
        b.bar(a);
        System.out.println("Nazad v drugoy potok");
    }

    public static void main(String[] args) {
        new Deadlock();
    }

}
