package lesson3;

public class LifeTime {
    public static void main(String[] args) {
        int x;
        for (x =0; x<3; x++) {
            int y = -1;
            System.out.println("y ravno : " + y);
            y= 100;
            System.out.println("y teper ravno : " + y);
        }
    }
}