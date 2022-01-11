package lesson11;

public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Dlya ostanovki najmite Ctrl-C.");
    }
}
