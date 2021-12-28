package lesson14;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob = new MyClass<Character>(chs);
        System.out.println("Maksimalnoe znachenie v massive inums: " + iob.max());
        System.out.println("Minimalnoe znachenie v massive inums: " + iob.min());
        System.out.println("Maksimalnoe znachenie v massive chs: " + cob.max());
        System.out.println("Minimalnoe znachenie v massive chs: " +cob.min());
    }
}
