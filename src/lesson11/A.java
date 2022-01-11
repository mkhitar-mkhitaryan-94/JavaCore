package lesson11;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " voshel v metod A.foo()");

        try {
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("klass A prervan");
        }
        System.out.println(name + " pytaetsya wyzvat metod B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("V metode A.last()");
    }
}
