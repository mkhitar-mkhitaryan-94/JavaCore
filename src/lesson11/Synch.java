package lesson11;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Dobro pojalovat");
        Caller ob2 = new Caller(target, "V sinxronizirivani");
        Caller ob3 = new Caller(target, "mir!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Prervano");
        }
    }
}
