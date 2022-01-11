package lesson11;

public class PCFixed {
    public static void main(String[] args) {
        Q2 q = new Q2();
        new Producer1(q);
        new Consumer1(q);
        System.out.println("Dlya ostanovki najmite Ctrl-C.");
    }
}
